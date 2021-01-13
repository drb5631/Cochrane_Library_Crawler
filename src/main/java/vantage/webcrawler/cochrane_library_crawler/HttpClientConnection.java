package vantage.webcrawler.cochrane_library_crawler;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author David Richard Blon Jr A class for taking in a Creating an HTTP
 * connection. That connection will then use the Jsoup library to return a
 * parsed HTML document
 */
public class HttpClientConnection {

    private static String parsedHTML;
    private static Document appraisingLink;

    /**
     * @author David Richard Blon Jr
     * @param url The URL that needs to be parsed to retrieve its HTML
     * @return Document that allows for HTML parsing
     * @throws IOException will thrown if we lose a connection or the connection
     * is no longer available
     */
    public static Document getCochraneURL(String url) throws IOException {
        CookieStore cookieStore = new BasicCookieStore();
        BasicClientCookie clientCookie = new BasicClientCookie("JSESSIONID", "cspbwgreclprt160z1~F10FF4C05FEDA5E6583E29A8D8A561A3");
        clientCookie.setDomain("www.cochranelibrary.com");
        clientCookie.setPath("/");
        cookieStore.addCookie(clientCookie);
        try {
            CloseableHttpClient httpClient = HttpClients.custom().setDefaultCookieStore(cookieStore)
                    .setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36")
                    .build();
            HttpGet request = new HttpGet(url);
            try {
                HttpResponse response = httpClient.execute(request);
                //System.out.println(response);
                int responseStatus = response.getStatusLine().getStatusCode();
                if (responseStatus == HttpStatus.SC_OK) {
                    HttpEntity entity = response.getEntity();
                    if (entity != null) {
                        parsedHTML = EntityUtils.toString(entity);
                    }
                    appraisingLink = Jsoup.parse(parsedHTML);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                httpClient.close();
            }
            return appraisingLink;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
