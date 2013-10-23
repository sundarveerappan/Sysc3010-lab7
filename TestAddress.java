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
public class TestAddress extends TestCase
{
    /**
     * Constructor for test class TestAddress1
     */
    public void testtoString()
    {
         Address a = new Address(428,"Sunnyside", "Ottawa", "K1S4W9");
         String actual = a.toString();
         String good = Integer.toString(a.getunit()) + " " + a.getstreet() + ", " + a.getcity() + ", " + a.getpostalcode();
         try
         {
             assertEquals(actual, good);
         }catch(Exception e){
             System.out.println("It dun goofed");
         }
    }
    
    public void testequals()
    {
        Address b = new Address(428,"Sunnyside", "Ottawa", "K1S4W9");
        Address b2 = new Address(428,"Sunnyside", "Ottawa", "K1S4W9");
        Address b3 = new Address(44, "Lyman Drive", "Saint John", "E3E4O7");
        
        try
        {
            assertTrue(b.equals(b2));
            assertFalse(b.equals(b3));
        }
        catch(Exception e){
            System.out.println("It dun goofed");
        }
        
    }
    
    public void testisValidPostalCode()
    {
        Address c = new Address(428,"Sunnyside", "Ottawa", "K1S4W9");
        String goodpostal = c.getpostalcode();
        String badpostal1 = "111111";
        String badpostal2 = "K1S4W999";
        try{
            assertTrue(c.isValidPostalCode(goodpostal));
            assertFalse(c.isValidPostalCode(badpostal1));
            assertFalse(c.isValidPostalCode(badpostal2));
        }catch(Exception e){
            System.out.println("It dun goofed");
        }
    }
}
