package vantage.webcrawler.cochrane_library_crawler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author David Richard Blon Jr A Class for taking all elements retrieved by
 * topic and writing the reviews data to a file.
 */
public class CochraneFileCreator {
    
    private static String fileToCreate = "Cochrane_Reviews/cochrane_reviews.txt";

    /**
     * @author David Richard Blon Jr
     * @param reviews All the reviews found by indexing the topic
     * @param topic The topic that was chosen to search reviews for
     */
    public static void createFile(ArrayList<Elements> reviews, String topic) {
        System.out.println("File To Write: " + fileToCreate);
        try (FileWriter file = new FileWriter(fileToCreate);
                BufferedWriter bw = new BufferedWriter(file)) {
            System.out.println("Hit File Writer");
            int reviewCount = 0;
            for (Elements review : reviews) {
                for (Element e : review) {
                    reviewCount++;
                    bw.write(
                            "https://www.cochranelibrary.com" + e.getElementsByClass("result-title").select("a[href]").attr("href") + "|"
                            + topic + "|"
                            + e.getElementsByClass("result-title").text() + "|"
                            + e.getElementsByClass("search-result-authors").text() + "|"
                            + CochraneFileCreator.getDateFormat(e.getElementsByClass("search-result-date").text()
                    ));
                    bw.newLine();
                }
            }
            System.out.println("File Written");
            System.out.println("Total Reviews: " + reviewCount);
            file.flush();
            bw.close();

        } catch (IOException e) {
        }

    }
    
    private static String getDateFormat(String date) {
        String[] characters = date.trim().split(" ");
        String separator = "-";
        String month = "";
        switch(characters[1]) {
            case "January": month = "01"; break;
            case "February": month = "02"; break;
            case "March": month = "03"; break;
            case "April": month = "04"; break;
            case "May": month = "05"; break;
            case "June": month = "06"; break;
            case "July": month = "07"; break;
            case "August": month = "08"; break;
            case "September": month = "09"; break;
            case "October": month = "10"; break;
            case "November": month = "11"; break;
            case "December": month = "12"; break;
            default: month = "01";
        }
        return String.join(separator, characters[2], month, characters[0]);
    }

}
