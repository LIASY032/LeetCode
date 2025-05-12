import java.util.HashMap;
import java.util.Map;

/**
 * @author: Jack Liang
 * @date: 8/5/2025
 */

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String output = "";
        Map<Character, String> map = new HashMap<>();
        map.put(s.charAt(0), "" + s.charAt(0));
        output = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            for (Character key : map.keySet()) {
                String current = map.get(key);
                map.put(key, current + s.charAt(i));
            }
            if (map.containsKey(s.charAt(i))) {
                String current = map.get(s.charAt(i));
                if (current.length() > output.length()) {
                    output = current;
                }
            } else {

                map.put(s.charAt(i), "" + s.charAt(i));

            }


        }

        return output;
    }
}
