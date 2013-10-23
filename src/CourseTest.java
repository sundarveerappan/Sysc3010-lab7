import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTest {

	@Test
	public void testGetId() {
		Course course = new Course("1001", "Ecor");
		assertEquals("1001", course.getId());
	}

	@Test
	public void testGetName() {
		Course course = new Course("1001", "Ecor");
		assertEquals("Ecor", course.getName());
	}

	@Test
	public void testToString() {
		Course course = new Course("1001", "Ecor");
		assertEquals("Ecor 1001", course.toString());
	}

	@Test
	public void testEqualsObject() {
		Course course = new Course("1001", "Ecor");
		Course course2 = new Course("1002", "Ecor");
		assertTrue(course2.equals(course));
	}

	@Test
	public void testGetProfessor() {
		Course course = new Course("1001", "Ecor");
		Professor prof = new Professor("Shan", "Veer");
		course.setProfessor(prof);
		assertEquals(prof, course.getProfessor());
	}

	@Test
	public void testAddStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStudents() {
		Course course = new Course("1001", "Ecor");
		Student student = new Student("James", "Ryan");
		Student student2 = new Student("Korey", "Conway");
		Student student3 = new Student("Jimmy", "Zheng");
		course.addStudent(student3);
		course.addStudent(student2);
		course.addStudent(student);
		course.removeStudent(student3);
		Student[] Students = course.getStudents();
		assertNotNull(Students);
		assertEquals(2, Students.length);

		boolean c1IsInArray = student.equals(Students[0])
				|| student.equals(Students[1]);
		assertTrue(c1IsInArray);

		boolean c2IsInArray = student2.equals(Students[0])
				|| student2.equals(Students[1]);
		assertTrue(c2IsInArray);

	}

}
