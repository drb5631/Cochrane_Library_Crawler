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
public class CredentialCheckTest {
    
    public CredentialCheckTest() {
    }

    /**
     * Test of verifyCredentials method, of class CredentialCheck.
     */
    @Test
    public void testVerifyCredentials() {
        System.out.println("verifyCredentials");
        String username = "";
        String password = "";
        CredentialCheck instance = new CredentialCheck();
        boolean expResult = false;
        boolean result = instance.verifyCredentials(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
