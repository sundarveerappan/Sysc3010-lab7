import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testGetNumber() {
		Student s1 = new Student("James", "Bond");
		Student s2 = new Student("James", "Bond");
		assertEquals(0, s1.getNumber());
		assertEquals(1, s2.getNumber());
	}

}
