import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * @author: Jack Liang
 * @date: 8/5/2025
 */

public class LongestPalindromicSubstringTest {
    @Test
    public void testExample1() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        String result = solver.longestPalindrome("babad");
        assertTrue(result.equals("bab") || result.equals("aba"));
    }

    @Test
    public void testExample2() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        String result = solver.longestPalindrome("cbbd");
        assertEquals("bb", result);
    }

    @Test
    public void testSingleCharacter() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        String result = solver.longestPalindrome("a");
        assertEquals("a", result);
    }

    @Test
    public void testAllSameCharacters() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        String result = solver.longestPalindrome("aaaa");
        assertEquals("aaaa", result);
    }

    @Test
    public void testNoPalindromeLongerThanOne() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        String result = solver.longestPalindrome("abcd");
        assertTrue("a".equals(result) || "b".equals(result) || "c".equals(result) || "d".equals(result));
    }

    @Test
    public void testNumericPalindrome() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        String result = solver.longestPalindrome("123454321");
        assertEquals("123454321", result);
    }

    @Test
    public void testMixedAlphaNumeric() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        String result = solver.longestPalindrome("a1b2b1a");
        assertEquals("a1b2b1a", result);
    }
}
