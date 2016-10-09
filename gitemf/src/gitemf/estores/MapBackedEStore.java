package gitemf.estores;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;

/**
 * Simple map-backed EStore to keep object state temporarily until we move it to
 * the Git resource.
 */
public class MapBackedEStore implements EStore {

	private final Map<EStructuralFeature, Object> values = new HashMap<>();

	@SuppressWarnings("unchecked")
	@Override
	public Object get(InternalEObject object, EStructuralFeature feature, int index) {
		Object raw = values.get(feature);
		if (index == EStore.NO_INDEX || !feature.isMany()) {
			return raw;
		}

		if (raw instanceof EList) {
			EList<Object> el = (EList<Object>)raw;
			return el.get(index);
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		if (index == EStore.NO_INDEX || !feature.isMany()) {
			return values.put(feature, value);
		} else {
			EList<Object> raw = (EList<Object>) values.get(object);
			if (raw == null) {
				raw = new BasicEList<Object>();
				values.put(feature, raw);
			}
			return raw.set(index, value);
		}
	}

	@Override
	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		return values.containsKey(feature);
	}

	@Override
	public void unset(InternalEObject object, EStructuralFeature feature) {
		values.remove(feature);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
		Object raw = values.get(feature);
		if (raw == null) {
			return true;
		} else if (raw instanceof EList) {
			return ((EList<Object>)raw).isEmpty();
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public int size(InternalEObject object, EStructuralFeature feature) {
		Object raw = values.get(feature);
		if (raw instanceof EList) {
			return ((EList<Object>)raw).size();
		} else {
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean contains(InternalEObject object, EStructuralFeature feature, Object value) {
		Object raw = values.get(feature);
		if (raw instanceof EList) {
			return ((EList<Object>)raw).contains(value);
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public int indexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		Object raw = values.get(feature);
		if (raw instanceof EList) {
			return ((EList<Object>)raw).indexOf(value);
		} else {
			return EStore.NO_INDEX;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public int lastIndexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		Object raw = values.get(feature);
		if (raw instanceof EList) {
			return ((EList<Object>)raw).lastIndexOf(value);
		} else {
			return EStore.NO_INDEX;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		if (!feature.isMany()) {
			throw new IllegalArgumentException(String.format("Feature %s is not many-valued, cannot add", feature.getName()));
		}

		EList<Object> l = (EList<Object>) values.get(feature);
		if (l == null) {
			l = new BasicEList<Object>();
			values.put(feature, l);
		}
		l.add(index, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object remove(InternalEObject object, EStructuralFeature feature, int index) {
		Object raw = values.get(feature);
		if (raw instanceof EList) {
			return ((EList<Object>)raw).remove(index);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object move(InternalEObject object, EStructuralFeature feature, int targetIndex, int sourceIndex) {
		Object raw = values.get(feature);
		if (raw instanceof EList) {
			return ((EList<Object>)raw).move(targetIndex, sourceIndex);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear(InternalEObject object, EStructuralFeature feature) {
		Object raw = values.get(feature);
		if (raw instanceof EList) {
			((EList<Object>)raw).clear();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
		if (feature.isMany()) {
			EList<Object> raw = (EList<Object>)values.get(feature);
			if (raw == null) {
				return new Object[0];
			}
			return raw.toArray();
		} else if (values.containsKey(feature)) {
			return new Object[] { values.get(feature) };
		} else {
			return new Object[0];
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(InternalEObject object, EStructuralFeature feature, T[] array) {
		if (feature.isMany()) {
			EList<Object> raw = (EList<Object>)values.get(feature);
			if (raw == null) {
				for (int i = 0; i < array.length; i++) {
					array[i] = null;
				}
				return array;
			} else {
				return raw.toArray(array);
			}
		} else if (values.containsKey(feature)) {
			if (array.length >= 1) {
				array[0] = (T) values.get(feature);
				for (int i = 1; i < array.length; i++) {
					array[i] = null;
				}
				return array;
			} else {
				T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), 1);
				newArray[0] = (T) values.get(feature);
				return newArray;
			}
		} else {
			return (T[])Array.newInstance(array.getClass().getComponentType(), 0);
		}
	}

	@Override
	public int hashCode(InternalEObject object, EStructuralFeature feature) {
		Object val = values.get(feature);
		return val == null ? 0 : val.hashCode();
	}

	@Override
	public InternalEObject getContainer(InternalEObject object) {
		return object.eInternalContainer();
	}

	@Override
	public EStructuralFeature getContainingFeature(InternalEObject object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EObject create(EClass eClass) {
		throw new UnsupportedOperationException();
	}

}
