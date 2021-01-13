package vantage.webcrawler.cochrane_library_crawler;

import java.io.IOException;
import java.util.ArrayList;
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
    private static String cochraneURL = "https://www.cochranelibrary.com/";

    // ADD UNIQUE JSESSIONID TO HttpClientConnection in BasicClientCookie
    
    public static void main(String[] args) throws IOException {

        Document appraisingLink = HttpClientConnection.getCochraneURL(cochraneURL);

        Element cochraneMedicalTopic = HtmlParser.getCochraneTopic(appraisingLink);
        System.out.println("Topic: " + cochraneMedicalTopic.text());

        Document cochraneReviews = HttpClientConnection.getCochraneURL(cochraneMedicalTopic.select("a[href]").attr("href"));

        ArrayList<String> allTopicReviewsPages = HtmlParser.getTopicPageList(cochraneReviews);

        allTopicReviews.add(cochraneReviews.getElementsByClass("search-results-item-body"));

        for (String url : allTopicReviewsPages) {
            Document page = HttpClientConnection.getCochraneURL(url);
            allTopicReviews.add(page.getElementsByClass("search-results-item-body"));
        }

        try {
            CochraneFileCreator.createFile(allTopicReviews, cochraneMedicalTopic.text());
        } catch (Exception e) {
            e.getMessage();
        }

    }

}
