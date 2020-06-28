/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alban
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class LoanHistoryTest {
    
    public LoanHistoryTest() {
    }

    /**
     * Test of getInstance method, of class LoanHistory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        LoanHistory expResult = null;
        LoanHistory result = LoanHistory.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class LoanHistory.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        LoanRequest request = null;
        LoanHistory instance = null;
        instance.add(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class LoanHistory.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        LoanHistory instance = null;
        List<LoanRequest> expResult = null;
        List<LoanRequest> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class LoanHistory.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        LoanHistory instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
