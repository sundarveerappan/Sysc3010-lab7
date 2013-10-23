import java.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.*;

/**
 * James Ryan
 *
 * @author  James Ryan
 * @version October 23, 2013
 */
public class TestName extends TestCase
{
    /**
     * Constructor for test class TestAddress1
     */
    public void testtoString()
    {
         Name a = new Name("James", "Ryan");
         String actual = a.toString();
         String good = "James Ryan";
         try
         {
             assertEquals(actual, good);
         }catch(Exception e){
             System.out.println("It dun goofed");
         }
    }
    
    public void testequals()
    {
        Name b = new Name("James" , "Ryan");
        Name b2 = new Name("James" , "Ryan");
        Name b3 = new Name("Jamesy" , "Ryooney");
        
        try
        {
            assertTrue(b.equals(b2));
            assertFalse(b.equals(b3));
        }
        catch(Exception e){
            System.out.println("It dun goofed");
        }
        
    }
    

}
