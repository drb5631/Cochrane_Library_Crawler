package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class AddressTest {
    
    Address address = new Address("123 Main St", "Philly", "PA", "12345");

    public AddressTest() {
    }
    
    /**
     * Test of getStreet method, of class Address.
     */
    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        String expResult = "123 Main St";
        String result = address.getStreet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCity method, of class Address.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        String expResult = "Philly";
        String result = address.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getState method, of class Address.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        String expResult = "PA";
        String result = address.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getZip method, of class Address.
     */
    @Test
    public void testGetZip() {
        System.out.println("getZip");
        String expResult = "12345";
        String result = address.getZip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Address.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "123 Main St, Philly, PA, 12345";
        String result = address.toString();
        assertEquals(expResult, result);
    }
}
