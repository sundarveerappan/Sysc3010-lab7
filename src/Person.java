import java.util.ArrayList;

public class Person {
	private Name name;
	private Address address;
	private ArrayList<Course> courses;

	public Person(String first, String last) {
		name = new Name(first, last);
	};

	public void setLastName(String name) {
		this.name.setLastName(name);
	};

	public String getLastName() {
		return name.getLastName();
	};

	public String getFirstName() {
		return name.getFirstName();
	};

	public String getFullName() {
		return name.toString();
	};

	public void setAddress(Address address) {
		this.address = address;
	};

	public Address getAddress() {
		return address;
	};

	public Course[] getCourses() {
		return (Course[]) courses.toArray();
	}

	public void addCourse(Course course) {
		courses.add(course);
	};

	public void remove(Course course) {
		courses.remove(course);
	};

	public String toString() {
		return name.toString();
	}

	public boolean equals(Object o) {
		if (o == null || o.getClass() != Person.class) {
			return false;
		}

		Person p2 = (Person) o;
		
		// TODO check for null values

		if (!name.equals(p2.name)) {
			return false;
		}

		if (!address.equals(p2.address)) {
			return false;
		}

		if (!courses.equals(p2.courses)) {
			return false;
		}
		
		return true;
	}

}
