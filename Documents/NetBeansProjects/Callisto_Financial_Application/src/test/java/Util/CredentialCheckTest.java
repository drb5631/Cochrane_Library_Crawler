/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alban
 */
public class CredentialCheckTest {
    
    public CredentialCheckTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
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
