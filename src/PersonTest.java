import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testSetLastName() {
		Person p = new Person("First", "Last");
		p.setLastName("Second");
		assertEquals("Second", p.getLastName());
	}

	@Test
	public void testGetLastName() {
		Person p = new Person("First", "Last");
		assertEquals("Last", p.getLastName());
	}

	@Test
	public void testGetFirstName() {
		Person p = new Person("First", "Last");
		assertEquals("First", p.getLastName());
	}

	@Test
	public void testGetFullName() {
		Person p = new Person("First", "Last");
		assertEquals("First Last", p.getLastName());
	}

	@Test
	public void testSetAddress() {
		Person p = new Person("First", "Last");
		try {
			Address a = new Address(1234, "Bronson Ave.", "Ottawa", "K2B 6F4");
			assertEquals(a, p.getAddress());
		} catch (Exception e) {
			fail("Failed to create address");
		}
	}

	@Test
	public void testAddCourse() {
		Person p = new Person("First", "Last");
		Course c1 = new Course("45", "Physics");
		Course c2 = new Course("46", "Math");
		p.addCourse(c1);
		p.addCourse(c2);

		Course[] courses = p.getCourses();
		assertNotNull(courses);
		assertEquals(2, courses.length);

		boolean c1IsInArray = c1.equals(courses[0]) || c1.equals(courses[1]);
		assertTrue(c1IsInArray);

		boolean c2IsInArray = c2.equals(courses[0]) || c2.equals(courses[1]);
		assertTrue(c2IsInArray);
	}

	@Test
	public void testRemove() {
		Person p = new Person("First", "Last");
		Course c1 = new Course("45", "Physics");
		Course c2 = new Course("46", "Math");
		p.addCourse(c1);
		p.addCourse(c2);

		assertEquals(2, p.getCourses().length);

		p.remove(c1);
		Course[] courses = p.getCourses();
		assertEquals(1, courses.length);

		boolean c2IsInArray = c2.equals(courses[0]);
		assertTrue(c2IsInArray);

		p.remove(c2);
		assertEquals(0, p.getCourses().length);
	}

	@Test
	public void testToString() {
		Person p = new Person("First", "Last");
		assertEquals("First Last", p.toString());
	}

	@Test
	public void testEqualsObject() {
		try {
			Course c1 = new Course("45", "Physics");
			Course c2 = new Course("46", "Math");
			Course c3 = new Course("446", "Geography");
			Address a1 = new Address(1234, "Bronson Ave.", "Ottawa", "K2B 6F4");
			Address a2 = new Address(12, "Harry Way", "Ottawa", "K2B 6F7");

			Person p1 = new Person("First", "Last");
			p1.addCourse(c1);
			p1.addCourse(c2);
			p1.setAddress(a1);

			Person p2 = new Person("First", "Last");
			p2.addCourse(c1);
			p2.addCourse(c2);
			p1.setAddress(a1);

			Person p3 = new Person("First", "Last");
			p2.addCourse(c1);
			p2.addCourse(c2);
			p2.addCourse(c3);
			p1.setAddress(a2);

			assertTrue(p1.equals(p1));
			assertTrue(p1.equals(p2));
			assertFalse(p1.equals(p3));
		} catch (Exception e) {
			fail("Failed to create address");
		}
	}

}
