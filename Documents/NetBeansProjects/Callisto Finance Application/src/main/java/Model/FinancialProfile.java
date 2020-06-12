package Model;

import Model.LoanRequest.LoanType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class FinancialProfile {
    
  private Identifier id;
  private LoanType loanType;
  private List<LoanRequest> activeLoans = new ArrayList<LoanRequest>();
  
  public FinancialProfile() {
      
  }
    
  public LoanRequest requestLoan(LoanType loanType, String loanAmaount) {
      return new LoanRequest(loanType, LoanRequest.LoanStatus.PENDING, loanAmaount);
      
  }
}
