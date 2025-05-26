import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author: Jack Liang
 * @date: 15/5/2025
 */

public class ReverseIntegerTest {
 @Test
 public void testPositiveNumber() {
  ReverseIntegerSolver rev = new ReverseIntegerSolver();
  int result = rev.reverse(123);
  assertEquals(321, result);
 }

 @Test
 public void testNegativeNumber() {
  ReverseIntegerSolver rev = new ReverseIntegerSolver();
  int result = rev.reverse(-123);
  assertEquals(-321, result);
 }

 @Test
 public void testTrailingZero() {
  ReverseIntegerSolver rev = new ReverseIntegerSolver();
  int result = rev.reverse(120);
  assertEquals(21, result);
 }

 @Test
 public void testZero() {
  ReverseIntegerSolver rev = new ReverseIntegerSolver();
  int result = rev.reverse(0);
  assertEquals(0, result);
 }

 @Test
 public void testOverflowPositive() {
  ReverseIntegerSolver rev = new ReverseIntegerSolver();
  int result = rev.reverse(1534236469); // Reversing causes overflow
  assertEquals(0, result);
 }

 @Test
 public void testOverflowNegative() {
  ReverseIntegerSolver rev = new ReverseIntegerSolver();
  int result = rev.reverse(-1563847412); // Reversing causes underflow
  assertEquals(0, result);
 }

 @Test
 public void testEdgeCaseMaxInt() {
  ReverseIntegerSolver rev = new ReverseIntegerSolver();
  int result = rev.reverse(Integer.MAX_VALUE); // 2147483647
  assertEquals(0, result); // Overflow after reversal
 }

 @Test
 public void testEdgeCaseMinInt() {
  ReverseIntegerSolver rev = new ReverseIntegerSolver();
  int result = rev.reverse(Integer.MIN_VALUE); // -2147483648
  assertEquals(0, result); // Underflow after reversal
 }
}
