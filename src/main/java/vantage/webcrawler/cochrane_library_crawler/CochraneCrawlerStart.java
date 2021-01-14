package vantage.webcrawler.cochrane_library_crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author David Richard Blon Jr
 * The starter class for crawling the Cochrane Library and retrieving topic information
 */
public class CochraneCrawlerStart {

    private static ArrayList<Elements> allTopicReviews = new ArrayList<>();
    private static String cochraneURL = "https://www.cochranelibrary.com/cdsr/reviews/topics";
    private static String cookieKey;

    // ADD UNIQUE JSESSIONID TO HttpClientConnection in BasicClientCookie
    
    public static void main(String[] args) throws IOException {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Please Enter Your Cookie Key: ");
            cookieKey = input.next();
            System.out.println("Processing Reviews...");
        }
        catch (Exception e) {
            e.getMessage();
        }

        Document appraisingLink = HttpClientConnection.getCochraneURL(cochraneURL, cookieKey);

        Element cochraneMedicalTopic = HtmlParser.getCochraneTopic(appraisingLink);
        System.out.println("Topic: " + cochraneMedicalTopic.text());

        Document cochraneReviews = HttpClientConnection.getCochraneURL(cochraneMedicalTopic.select("a[href]").attr("href"), cookieKey);

        ArrayList<String> allTopicReviewsPages = HtmlParser.getTopicPageList(cochraneReviews);

        allTopicReviews.add(cochraneReviews.getElementsByClass("search-results-item-body"));

        for (String url : allTopicReviewsPages) {
            Document page = HttpClientConnection.getCochraneURL(url, cookieKey);
            allTopicReviews.add(page.getElementsByClass("search-results-item-body"));
        }

        try {
            CochraneFileCreator.createFile(allTopicReviews, cochraneMedicalTopic.text());
            System.out.println("\nIf you did not get the result you expected, please check your key and make sure it is correct!");
        } catch (Exception e) {
            e.getMessage();
        }

    }

}
