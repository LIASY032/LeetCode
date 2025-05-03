import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * @author: Jack Liang
 * @date: 2/5/2025
 */



public class LongestSubstringTest {

    @Test
    public void testExample1() {
        LongestSubstringSolver solver = new LongestSubstringSolver();
        int result = solver.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);  // "abc"
    }

    @Test
    public void testExample2() {
        LongestSubstringSolver solver = new LongestSubstringSolver();
        int result = solver.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);  // "b"
    }

    @Test
    public void testExample3() {
        LongestSubstringSolver solver = new LongestSubstringSolver();
        int result = solver.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);  // "wke"
    }

    @Test
    public void testEmptyString() {
        LongestSubstringSolver solver = new LongestSubstringSolver();
        int result = solver.lengthOfLongestSubstring("");
        assertEquals(0, result);
    }

    @Test
    public void testSingleCharacter() {
        LongestSubstringSolver solver = new LongestSubstringSolver();
        int result = solver.lengthOfLongestSubstring("a");
        assertEquals(1, result);
    }

    @Test
    public void testAllUniqueCharacters() {
        LongestSubstringSolver solver = new LongestSubstringSolver();
        int result = solver.lengthOfLongestSubstring("abcdefg");
        assertEquals(7, result);  // whole string is unique
    }

    @Test
    public void testLongInputWithRepeats() {
        LongestSubstringSolver solver = new LongestSubstringSolver();
        int result = solver.lengthOfLongestSubstring("abba");
        assertEquals(2, result);  // "ab" or "ba"
    }

    @Test
    public void testWithSpacesAndSymbols() {
        LongestSubstringSolver solver = new LongestSubstringSolver();
        int result = solver.lengthOfLongestSubstring("a b@c!d");
        assertEquals(7, result);  // all unique
    }
}
