import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author: Jack Liang
 * @date: 4/5/2025
 */

public class MedianofTwoSortedArraysTest {
    @Test
    public void testExample1() {
        MedianofTwoSortedArrays finder = new MedianofTwoSortedArrays();
        double result = finder.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        assertEquals(2.0, result, 0.00001);
    }

    @Test
    public void testExample2() {
        MedianofTwoSortedArrays finder = new MedianofTwoSortedArrays();
        double result = finder.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        assertEquals(2.5, result, 0.00001);
    }


}
