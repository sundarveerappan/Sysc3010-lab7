import static org.junit.Assert.*;
import org.junit.After;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import junit.framework.*;
/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */

public class PersonTest extends TestCase
{
    /**
     * Default constructor for test class PersonTest
     */
    public Person tester1;
    public Person tester2;
    public Person tester3;    
    public String nameF1="a";
    public String nameL1="b";
    public String nameL2="c";
    public Address addressTester1;    
    public Address addressTester2;
    public Address addressTester3;
    public Address addressTester4;
    public Course course1;
    public Course course2;
    public ArrayList<Course> coursesTest;
    public  PersonTest()
    {
        tester1= new Person(nameF1,nameL1);        
        tester2= new Person(nameF1,nameL2);                
        tester3= new Person(nameF1,nameL1);
        addressTester1=new Address("street","city","postal");        
        addressTester2 =new Address("street","city","postal");
        addressTester3 =new Address(1,"street","city","postal");
        addressTester4 =new Address(1,"street","city","postal");     
        course1=new Course("11","sysc");
        course2=new Course("22","elec");
    }
        
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

    public void testgetLastName(){
        assertEquals(nameL1,tester1.getLastName());
    } 
    public void testgetFirstName(){
        assertEquals(nameL1,tester1.getFirstName());
    }
    public void testgetFullName(){
        assertEquals(nameF1+"; "+nameL1,tester1.getFullName());
    }
    public void testSetLastName(){
        tester1.setLastName(nameL2);
        assertEquals(nameL2,tester1.getLastName());
    }
    public void testAddress(){
        tester1.setAddress(addressTester1);
        assertEquals(addressTester2,tester1.getAddress());
        
        tester1.setAddress(addressTester3);
        assertEquals(addressTester4,tester1.getAddress());
    }
    public void testCourses(){
        
        assertNull(tester1.getCourses());
        tester1.addCourse(course1);
        assertNotNull(tester1.getCourses());
        tester1.addCourse(course2);
        assertNotNull(tester1.getCourses());
        tester1.remove(course2);        
        assertNotNull(tester1.getCourses());        
        tester1.remove(course1);
        assertNull(tester1.getCourses());
    }
    public void testToString(){
        assertEquals("a b, 1 street city postal, 0 courses",tester1);
        tester1.addCourse(course1);
        assertNotNull(tester1.getCourses());      
        assertEquals("a b, 1 street city postal, 1 courses, 11 sysc",tester1);
    }
    public void testEquals(){
        assertFalse(tester2==tester1);
        assertFalse(tester3==tester1); 
        tester3.setLastName(nameL2);
        assertFalse(tester2==tester1);
        assertFalse(tester3==tester1);        
        tester2.setAddress(addressTester3);           
        tester3.setAddress(addressTester1); 
        assertFalse(tester2==tester1);
        assertFalse(tester3==tester1); 
        tester2.setAddress(addressTester3);            
        assertFalse(tester2==tester1);
        assertFalse(tester3==tester1); 
        tester2.addCourse(course1);     
        assertTrue(tester2==tester1);        
        assertFalse(tester3==tester1); 
        tester2.addCourse(course1);        
        tester3.addCourse(course1); 
        assertFalse(tester2==tester1);           
        assertTrue(tester3==tester1); 
    }
}
