package Util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class CredentialCheck {

    private final String README = "README.txt";

    public boolean verifyCredentials(String username, String password) {

        BufferedReader bufferedReader;
        boolean verifiedCredentials = false;
        
        try {
            bufferedReader = new BufferedReader(new FileReader(README));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(username + ", " + password)) {
                    verifiedCredentials = true;
                    break;
                }
                else {
                    System.out.println("Invalid Credentials");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return verifiedCredentials;
    }
}
