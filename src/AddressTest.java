import static org.junit.Assert.*;

import org.junit.Test;


public class AddressTest {

	


	@Test
	public void testToString() {
		
		try {
			Address address = new Address(6,"vale st","ottawa","K2A 2B9");			
			assertEquals("6, vale st, ottawa, K2A 2B9", address.toString());
			
		} catch (Exception e) {
			fail("It jus throws an exception");
		}
		
	}

	@Test
	public void testEqualsObject() {
		try {
			Address address = new Address(6,"vale st","ottawa","K2A 2B9");
			Address address2 = new Address(6, "dole", "ottawa", "K2H 7G6");
			//assertTrue(address2.equals(address));
			assertFalse(address2.equals(address));
		} catch (Exception e) {
			fail("It jus throws an exception");
		}
	}	
		@Test
		public void testToString2() {
			
			try {
				Address address = new Address("vale st","ottawa","K2A 2B9");			
				assertEquals("vale st, ottawa, K2A 2B9", address.toString());
				
			} catch (Exception e) {
				fail("It jus throws an exception");
			}
			
		}

		@Test
		public void testEqualsObject2() {
			try {
				Address address = new Address("vale st","ottawa","K2A 2B9");
				Address address2 = new Address("dole", "ottawa", "K2H 7G6");
				Address address3 = new Address("vale st","ottawa","K2A 2B9");
				//assertTrue(address2.equals(address));
				assertFalse(address2.equals(address));
				assertTrue(address3.equals(address));
			} catch (Exception e) {
				fail("It jus throws an exception");
			}
		
	}



}
