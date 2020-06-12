package Demo;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class MFinanceDriver {
    
    private int menuChoice;
    private Scanner scanner;

    public void beginApp() {
        
        selectOption();
        
    }
        
        

    public void selectOption() {
        do {
            
            System.out.print("\n1) Employee Login\n"
                    + "2) Customer Login\n"
                    + "3) Exit mFinance");

            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    displayEmployeeOptions();
                    break;
                case 2:
                    displayCustomerOptions();
                    break;
                case 3:
                    System.out.println("\nGoodbye");
                    System.exit(0);
                    break;
            }
        } while (menuChoice != 5);
    }
    
    public void displayEmployeeOptions() {
        System.out.print("Please enter your employee credentials: ");
        String employeeLogin = scanner.next();
        
    }
    
    public void displayCustomerOptions() {
        
    }
    
}