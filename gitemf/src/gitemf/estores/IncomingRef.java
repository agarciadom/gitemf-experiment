package gitemf.estores;

class IncomingRef implements Comparable<IncomingRef> {
	private final String referencePath, featureName;
	private final int index;

	public IncomingRef(String referencePath, String featureName, int index) {
		this.referencePath = referencePath;
		this.featureName = featureName;
		this.index = index;
	}

	public String getReferencePath() {
		return referencePath;
	}

	public String getFeatureName() {
		return featureName;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((featureName == null) ? 0 : featureName.hashCode());
		result = prime * result + index;
		result = prime * result + ((referencePath == null) ? 0 : referencePath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IncomingRef other = (IncomingRef) obj;
		if (featureName == null) {
			if (other.featureName != null)
				return false;
		} else if (!featureName.equals(other.featureName))
			return false;
		if (index != other.index)
			return false;
		if (referencePath == null) {
			if (other.referencePath != null)
				return false;
		} else if (!referencePath.equals(other.referencePath))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IncomingRef [referencePath=" + referencePath + ", featureName=" + featureName + ", index=" + index + "]";
	}

	@Override
	public int compareTo(IncomingRef o) {
		final int cmpRef = referencePath.compareTo(o.referencePath);
		if (cmpRef != 0) {
			return cmpRef;
		}

		final int cmpFeatureName = featureName.compareTo(o.featureName);
		if (cmpFeatureName != 0) {
			return cmpFeatureName;
		}

		return index - o.index;
	}
}