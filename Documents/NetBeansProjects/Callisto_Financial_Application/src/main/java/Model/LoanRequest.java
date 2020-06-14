package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author david
 */
public class LoanRequest {
    
  private Identifier id;
  private LocalDateTime dateTimeCreated;
  private LoanType loanType;
  private LoanStatus loanStatus;
  private String loanAmount;
    
    public enum LoanType {
        
        PERSONAL,
        SCHOOL,
        BUSINESS
    
    }
    
    public enum LoanStatus {
        
        PENDING,
        ACCEPTED,
        DENIED
        
    }
    
    public LoanRequest(LoanType loanType, LoanStatus loanStatus, String loanAmount) {
    this.id = new Identifier();
    this.dateTimeCreated = LocalDateTime.now();
    this.loanType = loanType;
    this.loanStatus = loanStatus;
    this.loanAmount = loanAmount;
  }
    
    public Identifier getId() {
        return id;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }
    
    public void setId(Identifier id) {
        this.id = id;
    }

    public void setDateTimeCreated(LocalDateTime dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }
    
    public LocalDateTime getDateTimeCreated() {
        return this.dateTimeCreated;
  }
    
    public String getAmount() {
        return loanAmount;
    }

    public void setAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String dateTimeCreatedFormatted = this.dateTimeCreated.format(formatter);

    return String.format(
        "%s|%s|%s|%s",
        this.id,
        dateTimeCreatedFormatted,
        this.loanType,
        this.loanAmount
    );
  }
}
