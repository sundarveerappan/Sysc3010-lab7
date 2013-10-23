import static org.junit.Assert.*;

import org.junit.Test;

public class ProfessorTest {

	@Test
	public void testSetOffice() {
		Professor p = new Professor("Frank", "Instein");
		p.setOffice("my office");
		assertEquals("my office", p.getOffice());
	}

}
