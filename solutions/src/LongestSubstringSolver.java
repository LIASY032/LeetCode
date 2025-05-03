/**
 * @author: Jack Liang
 * @date: 2/5/2025
 */

public class LongestSubstringSolver {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        char[] chars = s.toCharArray();
        String currentChars = "" + chars[0];
        int longest = 1;

        char currentChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (currentChar != chars[i]) {
                currentChar = chars[i];
                currentChars += currentChar;
                if (i < chars.length - 1 && currentChars.contains("" + chars[i + 1])) {
                    if (currentChars.length() > longest) {
                        longest = currentChars.length();
                    }
                    currentChars = "" + currentChar;
                }
            }

        }
        if (currentChars.length() > longest) {
            longest = currentChars.length();
        }
        return longest;
    }
}
