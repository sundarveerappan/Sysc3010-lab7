import static org.junit.Assert.*;

import org.junit.Test;


public class NameTest {

	@Test
	public void testToString() {
		Name n = new Name("First", "Last");
		assertEquals("First Last", n.toString());
	}

	@Test
	public void testEqualsObject() {
		Name n1 = new Name("James", "Bond");
		Name n2 = new Name("James", "Bond");
		Name n3 = new Name("James", "Bond45");
		
		assertTrue(n1.equals(n1));
		assertTrue(n1.equals(n2));
		assertFalse(n1.equals(n3));		
		assertFalse(n2.equals(n3));		
	}
}
