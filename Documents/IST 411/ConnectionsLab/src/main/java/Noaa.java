

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Noaa {
    
    public Noaa() {
        String acccessToken = "hsgVQCUJhguxzaGCZNAqfMqYcZiXcKvA";
        
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        
        String response;
        HttpURLConnection connection = null;
        
        try {
            URL url = new URL("https://www.ncdc.noaa.gov/cdo-web/api/v2/datasets");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("token", acccessToken);
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