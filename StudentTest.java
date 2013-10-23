

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class StudentTest
     */
    Student st1;
    public StudentTest()
    {
        st1=new Student("a","b");
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    public void testGetNumber(){
        assertTrue(-1!=(st1.getNumber()));
    }
}
