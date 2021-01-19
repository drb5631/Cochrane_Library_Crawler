package vantage.webcrawler.cochrane_library_crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author David Richard Blon Jr
 * The starter class for crawling the Cochrane Library and retrieving topic information
 */
public class CochraneCrawlerStart {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Elements> allTopicReviews = new ArrayList<>();
    private static String cochraneURL = "https://www.cochranelibrary.com/cdsr/reviews/topics";
    private static String cookieKey;
    private static String continueChoice;

    public static void main(String[] args) throws IOException {
        do {
            try {
                System.out.print("Please Enter Your Cookie Key: ");
                cookieKey = input.next();
            } catch (Exception e) {
                e.getMessage();
            }

            Document appraisingLink = HttpClientConnection.getCochraneURL(cochraneURL, cookieKey);

            Element cochraneMedicalTopic = HtmlParser.getCochraneTopic(appraisingLink);
            System.out.println("Topic: " + cochraneMedicalTopic.text());
            System.out.println("Processing Reviews...");

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

            System.out.print("\nFind More Reviews? (Y or N): ");
            continueChoice = input.next();
            System.out.println();
        } while (continueChoice.equalsIgnoreCase("y"));
    }

}
