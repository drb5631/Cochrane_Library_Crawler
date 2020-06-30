package Demo;

import Model.LoanHistory;
import java.util.Scanner;

/**
 * A class that drives the application by giving the base options when the user
 * chooses how they want to proceed with their experience.
 */
public class MFinanceDriver {

    private String menuChoice;
    private Scanner scanner = new Scanner(System.in);
    LoanHistory history = LoanHistory.getInstance();
    private String subMenuChoice;

    /**
     * Will display a list of options for the employee to interact with customer
     * information.
     */
    public void displayEmployeeOptions() {
        do {
            System.out.println("1) View Customer Profile");
            System.out.println("2) View Loan History");
            System.out.println("3) Perform Credit Check");
            System.out.println("4) Exit");
            System.out.print("Choice: ");

            subMenuChoice = scanner.next();

            switch (subMenuChoice) {
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
            }
        } while (!subMenuChoice.equals("4"));
    }

    /**
     * Will display a list of options for the customer to requests loans and
     * make payments.
     */
    public void displayCustomerOptions() {
        do {
        System.out.println("Request Loan");
        System.out.println("Make a payment");
        System.out.println("View My Loan History");
        System.out.println("4) Exit");
        System.out.print("Choice: ");
        
        subMenuChoice = scanner.next();

            switch (subMenuChoice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
            }
        
        } while(!subMenuChoice.equals("4"));

    }

}
