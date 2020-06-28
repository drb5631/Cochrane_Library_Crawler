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
public class DoubleUtilTest {
    
    public DoubleUtilTest() {
    }

    /**
     * Test of tryParseDouble method, of class DoubleUtil.
     */
    @Test
    public void testTryParseDouble() {
        System.out.println("tryParseDouble");
        String text = "";
        Double expResult = null;
        Double result = DoubleUtil.tryParseDouble(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
