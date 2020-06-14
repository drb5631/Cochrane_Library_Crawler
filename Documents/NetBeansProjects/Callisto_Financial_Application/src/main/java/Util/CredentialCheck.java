package Util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author david
 */
public class CredentialCheck {
    String basePathString = Paths.get("").toAbsolutePath().toString();
    private final String README = basePathString + "\\src\\main\\java\\Demo\\README.txt";

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
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return verifiedCredentials;
    }
}
