package Model;

import Model.LoanRequest.LoanType;

/**
 * A class representing a financial profile for a customer.
 */
public class FinancialProfile {

    private LoanType loanType;
    private Customer customer;

    /**
     * A constructor for creating a customer's financial profile.
     *
     * @param customer A customer who the financial profile represents.
     */
    public FinancialProfile(Customer customer) {
        this.customer = customer;
    }

    /**
     * Returns a new loan request for a customer.
     *
     * @param id ID representing the specific loan.
     * @param loanType The type of loan requested.
     * @param loanAmaount the amount of the loan.
     * @return A LoanRequest for a customer.
     */
    public LoanRequest requestLoan(Identifier id, LoanType loanType, String loanAmaount) {
        return new LoanRequest(id, loanType, LoanRequest.LoanStatus.PENDING, loanAmaount);

    }
}
