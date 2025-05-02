/**
 * @author: Jack Liang
 * @date: 1/5/2025
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

 @Test
 public void testExample1() {
  TwoSumSolver solver = new TwoSumSolver();
  int[] result = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
  assertArrayEquals(new int[]{0, 1}, result);
 }

 @Test
 public void testExample2() {
  TwoSumSolver solver = new TwoSumSolver();
  int[] result = solver.twoSum(new int[]{3, 2, 4}, 6);
  assertArrayEquals(new int[]{1, 2}, result);
 }

 @Test
 public void testExample3() {
  TwoSumSolver solver = new TwoSumSolver();
  int[] result = solver.twoSum(new int[]{3, 3}, 6);
  assertArrayEquals(new int[]{0, 1}, result);
 }

 @Test
 public void testNegativeNumbers() {
  TwoSumSolver solver = new TwoSumSolver();
  int[] result = solver.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
  assertArrayEquals(new int[]{2, 4}, result);
 }

 @Test
 public void testLargeNumbers() {
  TwoSumSolver solver = new TwoSumSolver();
  int[] result = solver.twoSum(new int[]{1000000000, 500000000, -1500000000}, -1000000000);
  assertArrayEquals(new int[]{1, 2}, result);
 }
}
