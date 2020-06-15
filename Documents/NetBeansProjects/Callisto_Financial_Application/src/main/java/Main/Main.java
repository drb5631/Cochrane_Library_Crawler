package Main;

import Demo.MFinanceDriver;

/**
 * This is the main class where the application will be started from by calling
 * the MFinanceDriver class.
 */
public class Main {

    /**
     * The main method that runs the program.
     *
     * @param args All the arguments being used in the program.
     */
    public static void main(String args[]) {

        MFinanceDriver app = new MFinanceDriver();
        System.out.println("\nWelcome to mFinance! (A Product by the Callisto Financial Group)");
        app.beginApp();

    }

}
