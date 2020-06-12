package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author david
 */
public class LoanHistory {
    
  private static final LoanHistory INSTANCE = new LoanHistory();
  private List<LoanRequest> history;
  
  private LoanHistory() {
    this.history = Collections.synchronizedList(new ArrayList<>());
  }

  public static LoanHistory getInstance() {
    return INSTANCE;
  }

  public void add(LoanRequest request) {
    this.history.add(request);
  }

  public List<LoanRequest> getAll() {
    return this.history;
  }
    
  public void clear() {
    this.history.clear();
  }
  
}
