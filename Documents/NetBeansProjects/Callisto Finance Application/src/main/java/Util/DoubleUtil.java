package Util;

/**
 *
 * @author david
 */
public class DoubleUtil {

    public static Double tryParseDouble(String text) {
        try {
            return Double.parseDouble(text);
        } catch (Exception e) {
            return null;
        }
    }

}
