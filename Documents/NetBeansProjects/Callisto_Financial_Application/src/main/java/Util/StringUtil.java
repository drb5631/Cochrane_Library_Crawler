package Util;

/**
 *
 * @author david
 */
public class StringUtil {
    
    public static boolean isNullOrEmpty(String string) {
        return (string == null) || (string.isEmpty());
  }
    
    public static boolean isNullOrWhitespace(String string) {
        return (string == null) || (string.trim().isEmpty());
  }
    
}
