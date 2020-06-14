package Model;

import Model.LoanRequest.LoanType;

/**
 *
 * @author david
 */
public class FinancialProfile {
    
  private Identifier id;
  private LoanType loanType;
  private Customer customer;
  
  public FinancialProfile(Customer customer) {
      this.customer = customer;
  }
    
  public LoanRequest requestLoan(LoanType loanType, String loanAmaount) {
      return new LoanRequest(loanType, LoanRequest.LoanStatus.PENDING, loanAmaount);
      
  }
}
