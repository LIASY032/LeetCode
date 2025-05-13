import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * @author: Jack Liang
 * @date: 12/5/2025
 */

public class ZigzagConversionTest {

    @Test
    public void testExample1() {
        ZigzagConversionSolver converter = new ZigzagConversionSolver();
        String result = converter.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    public void testExample2() {
        ZigzagConversionSolver converter = new ZigzagConversionSolver();
        String result = converter.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    public void testExample3() {
        ZigzagConversionSolver converter = new ZigzagConversionSolver();
        String result = converter.convert("A", 1);
        assertEquals("A", result);
    }

    @Test
    public void testNumRowsGreaterThanLength() {
        ZigzagConversionSolver converter = new ZigzagConversionSolver();
        String result = converter.convert("ABC", 5);
        assertEquals("ABC", result); // When numRows >= s.length, result should be s itself
    }

    @Test
    public void testTwoRows() {
        ZigzagConversionSolver converter = new ZigzagConversionSolver();
        String result = converter.convert("ABCDEFG", 2);
        assertEquals("ACEGBDF", result);
    }

    @Test
    public void testAllSameChar() {
        ZigzagConversionSolver converter = new ZigzagConversionSolver();
        String result = converter.convert("AAAAAA", 3);
        assertEquals("AAAAAA", result);
    }

    @Test
    public void testOneRow() {
        ZigzagConversionSolver converter = new ZigzagConversionSolver();
        String result = converter.convert("HELLO", 1);
        assertEquals("HELLO", result);
    }
}
