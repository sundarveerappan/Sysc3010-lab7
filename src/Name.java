public class Name {
	private String first, last;

	public Name(String first, String last) {
		this.first = (first == null) ? "" : first;
		this.last = (last == null) ? "" : last;
	}
	
	public String getFirstName() {
		return first;
	}

	public String getLastName() {
		return last;
	}
	
	public void setLastName(String last) {
		this.last = last;
	}

	public String toString() {
		return first + " " + last;
	}

	public boolean equals(Object o) {
		if (o == null || o.getClass() != Name.class) {
			return false;
		}

		// Note: null values checked at constructor

		Name name2 = (Name) o;
		if (!first.equals(name2.first)) {
			return false;
		}

		if (!last.equals(name2.last)) {
			return false;
		}

		return true;
	}
}
