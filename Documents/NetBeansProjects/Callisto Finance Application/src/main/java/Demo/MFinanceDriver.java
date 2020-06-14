package Demo;

import Model.LoanHistory;
import Util.CredentialCheck;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class MFinanceDriver {

    private int menuChoice;
    private Scanner scanner = new Scanner(System.in);
    CredentialCheck credentialCheck = new CredentialCheck();
    private String username;
    private String password;
    LoanHistory history = LoanHistory.getInstance();

    public void beginApp() {

        selectOption();

    }

    public void selectOption() {
        do {
            System.out.println("\n1) Employee Login\n"
                    + "2) Customer Login\n"
                    + "3) Exit mFinance");
            
            System.out.print("Choice: ");
            
            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("Enter Employee Username: ");
                    username = scanner.next();
                    System.out.print("Enter Employee Password: ");
                    password = scanner.next();
                    
                    if (credentialCheck.verifyCredentials(username, password) == true) {
                        displayEmployeeOptions();
                    }
                    break;
                case 2:
                    System.out.print("Enter Customer Username: ");
                    username = scanner.next();
                    System.out.print("Enter Customer Password: ");
                    password = scanner.next();
                    
                    if (credentialCheck.verifyCredentials(username, password) == true) {
                        displayCustomerOptions();
                    }
                    break;
                case 3:
                    System.out.println("\nGoodbye");
                    System.exit(0);
                    break;
            }
        } while (menuChoice != 3);
    }

    public void displayEmployeeOptions() {
        
    }

    public void displayCustomerOptions() {

    }

}
