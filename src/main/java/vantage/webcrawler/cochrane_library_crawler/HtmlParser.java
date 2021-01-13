package vantage.webcrawler.cochrane_library_crawler;

import java.util.ArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author David Richard Blon Jr 
 * A class for taking the created Document and retrieving the chosen topic and all links for that topic
 */
public class HtmlParser {

    private static int cochraneTopicIndex = 1;

    /**
     * @author David Richard Blon Jr
     *
     * @param cochraneTopicPage The passed in Document with reviews to all for
     * retrieving the topic link
     * @return Element - The Element that hold the chosen topic information
     */
    public static Element getCochraneTopic(Document cochraneTopicPage) {
        Elements medicalTopics = cochraneTopicPage.getElementsByClass("browse-by-list-item");
        Element medicalTopic = medicalTopics.get(cochraneTopicIndex);
        return medicalTopic;
    }

    /**
     * @author David Richard Blon Jr
     * @param pageToReview The passed in Document to be parsed to get all the
     * connection topic links
     * @return ArrayList - Containing all the links for searching for the rest
     * of the reviews
     */
    public static ArrayList<String> getTopicPageList(Document pageToReview) {

        ArrayList<String> topicPages = new ArrayList<>();

        Elements cochraneTopicPages = pageToReview.getElementsByClass("pagination-page-list-item");

        for (Element e : cochraneTopicPages) {

            topicPages.add(e.select("a[href]").attr("href"));
        }

        return topicPages;
    }

}
