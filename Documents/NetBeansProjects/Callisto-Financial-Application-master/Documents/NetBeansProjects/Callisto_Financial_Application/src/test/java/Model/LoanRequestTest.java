/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alban
 */
public class LoanRequestTest {
    
    public LoanRequestTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class LoanRequest.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        LoanRequest instance = null;
        Identifier expResult = null;
        Identifier result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanType method, of class LoanRequest.
     */
    @Test
    public void testGetLoanType() {
        System.out.println("getLoanType");
        LoanRequest instance = null;
        LoanRequest.LoanType expResult = null;
        LoanRequest.LoanType result = instance.getLoanType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanStatus method, of class LoanRequest.
     */
    @Test
    public void testGetLoanStatus() {
        System.out.println("getLoanStatus");
        LoanRequest instance = null;
        LoanRequest.LoanStatus expResult = null;
        LoanRequest.LoanStatus result = instance.getLoanStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class LoanRequest.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Identifier id = null;
        LoanRequest instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateTimeCreated method, of class LoanRequest.
     */
    @Test
    public void testSetDateTimeCreated() {
        System.out.println("setDateTimeCreated");
        LocalDateTime dateTimeCreated = null;
        LoanRequest instance = null;
        instance.setDateTimeCreated(dateTimeCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateTimeCreated method, of class LoanRequest.
     */
    @Test
    public void testGetDateTimeCreated() {
        System.out.println("getDateTimeCreated");
        LoanRequest instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getDateTimeCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class LoanRequest.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        LoanRequest instance = null;
        String expResult = "";
        String result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class LoanRequest.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        String loanAmount = "";
        LoanRequest instance = null;
        instance.setAmount(loanAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LoanRequest.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LoanRequest instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
