package vantage.webcrawler.cochrane_library_crawler;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author David Richard Blon Jr
 * A class for taking the created Document and retrieving the chosen topic and all links for that topic
 */
public class HtmlParser {

    private static int cochraneTopicIndex = 0;
    private static String chosenTopic;

    /**
     * @param cochraneTopicPage The passed in Document with reviews to all for
     *                          retrieving the topic link
     * @return Element - The Element that hold the chosen topic information
     * @author David Richard Blon Jr
     */
    public static Element getCochraneTopic(Document cochraneTopicPage) {
        Elements medicalTopics = cochraneTopicPage.getElementsByClass("browse-by-list-item");
        try {
            int foundIndex;
            do {
                foundIndex = 0;
                System.out.print("Please Enter a Medical Topic as it Appears in the Browse By Topic Page: ");
                Scanner input = new Scanner(System.in);
                chosenTopic = input.nextLine();
                for (Element topic : medicalTopics) {
                    String topicString = topic.text().toLowerCase();
                    if (topicString.contains(chosenTopic)) {
                        foundIndex = 1;
                        break;
                    }
                    else if (cochraneTopicIndex > medicalTopics.size() - 1) {
                        cochraneTopicIndex = 1;
                    }
                    else {
                        cochraneTopicIndex++;
                    }
                }
            } while (foundIndex == 0);
        } catch (NullPointerException npe) {
            npe.getMessage();
        }
        return medicalTopics.get(cochraneTopicIndex);
    }

    /**
     * @param pageToReview The passed in Document to be parsed to get all the
     *                     connection topic links
     * @return ArrayList - Containing all the links for searching for the rest
     * of the reviews
     * @author David Richard Blon Jr
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
