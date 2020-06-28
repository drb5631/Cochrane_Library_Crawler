/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class StringUtilTest {
    
    public StringUtilTest() {
    }

    /**
     * Test of isNullOrEmpty method, of class StringUtil.
     */
    @Test
    public void testIsNullOrEmpty() {
        System.out.println("isNullOrEmpty");
        String string = "";
        boolean expResult = false;
        boolean result = StringUtil.isNullOrEmpty(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNullOrWhitespace method, of class StringUtil.
     */
    @Test
    public void testIsNullOrWhitespace() {
        System.out.println("isNullOrWhitespace");
        String string = "";
        boolean expResult = false;
        boolean result = StringUtil.isNullOrWhitespace(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
