/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class FinancialProfileTest {
    Identifier id = new Identifier();
    LoanRequest loan = new LoanRequest(id, LoanRequest.LoanType.PERSONAL, LoanRequest.LoanStatus.ACCEPTED, "3000");
    Address address = new Address("123 Main St", "Philly", "PA", "12345");
    Customer customer = new Customer(id, "Donald", "Trump", address, "02-21-1960", "123-456-7890");
    
    public FinancialProfileTest() {
    }

    /**
     * Test of requestLoan method, of class FinancialProfile.
     */
    @Test
    public void testRequestLoan() {
        System.out.println("requestLoan");
        LoanRequest.LoanType loanType = loan.getLoanType();
        String loanAmaount = loan.getAmount();
        FinancialProfile instance = new FinancialProfile(customer);
        LoanRequest expResult = instance.requestLoan(id, loan.getLoanType(), loan.getAmount());
        LoanRequest result = instance.requestLoan(id, loanType, loanAmaount);
        assertEquals(expResult, result);
    }
    
}
