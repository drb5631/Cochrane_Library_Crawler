
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* 
Project: Lab 4 Group Work
Purpose Details: Get and Post
Course: IST 411
Author: Team 1
Date Developed: 6/14/2020
Last Date Changed: 6/14/2020
Revision: 1
*/

public class HttpURLConnectionExample {

    public static void main(String[] args) throws Exception {
        HttpURLConnectionExample http = 
            new HttpURLConnectionExample();
        http.sendGet();
    }
    
    private void sendGet() throws Exception {
        String query = 
      "http://www.google.com/search?q=java+sdk&ie=utf-8&oe=utf-8";
        URL url = new URL(query);
        HttpURLConnection connection = 
            (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", 
            "Mozilla/5.0");
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        if (responseCode == 200) {
            String response = getResponse(connection);
            System.out.println("response: " + 
                response.toString());
        } else {
            System.out.println("Bad Response Code: " + 
                responseCode);
        }
    }
    
    private String getResponse(HttpURLConnection connection) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    connection.getInputStream()));) {
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            return response.toString();
        } catch (IOException ex) {
            // Handle exceptions
        }
        return "";
    }
}