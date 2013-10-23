import java.util.ArrayList;

public class Course {
	private String id;
	private String name;
	private Professor professor;
	private ArrayList<Student> students;

	public Course(String id, String name) {
		this.id = id;
		this.name = name;
	};

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name + " " + id;
	}

	public boolean equals(Object o) {
		if (o != null && o.getClass() != Course.class) {
			return false;
		}

		Course course2 = (Course) o;

		if (id != course2.id) {
			return false;
		}

		if (name != course2.name) {
			return false;
		}

		if (professor != course2.professor) {
			return false;
		}

		if (!students.equals(course2.students)) {
			return false;
		}

		return true;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	};

	public Professor getProfessor() {
		return professor;
	}

	public void addStudent(Student student) {
		students.add(student);
	};

	public void removeStudent(Student student) {
		students.remove(student);
	};

	public Student[] getStudents() {
		return (Student[]) students.toArray();
	}

}
