

package ist411_group1.connections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Noaa {
    
    public Noaa() {
        String acccessToken = "";
        Gson gson = new Gson();
        String response;
        HttpURLConnection connection = null;
        
        try {
            URL url = new URL("https://www.ncdc.noaa.gov/cdo-web/access/services/data/v1");
            connection = (HttpURLConnection) url.openConnection();
            connection.getRequestProperty("token", acccessToken);
            BufferedReader br = new BufferedReader(
                                new InputStreamReader(connection.getInputStream()));
            response = br.readLine();
            System.out.println(response + "\n");
        }
        catch (IOException e) {
            
            System.out.println(e);
        }
        finally {
            connection.disconnect();
        }
    }
    
}