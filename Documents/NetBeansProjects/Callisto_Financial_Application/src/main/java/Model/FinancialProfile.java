package Model;

import Model.LoanRequest.LoanType;

/**
 *
 * @author david
 */
public class FinancialProfile {
    
  private LoanType loanType;
  private Customer customer;
  
  public FinancialProfile(Customer customer) {
      this.customer = customer;
  }
    
  public LoanRequest requestLoan(Identifier id, LoanType loanType, String loanAmaount) {
      return new LoanRequest(id, loanType, LoanRequest.LoanStatus.PENDING, loanAmaount);
      
  }
}
