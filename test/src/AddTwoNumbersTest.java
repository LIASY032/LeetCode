import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * @author: Jack Liang
 * @date: 2/5/2025
 */

public class AddTwoNumbersTest {
 // Utility to convert array to ListNode
 private ListNode toListNode(int[] values) {
  ListNode dummy = new ListNode(0);
  ListNode current = dummy;
  for (int val : values) {
   current.next = new ListNode(val);
   current = current.next;
  }
  return dummy.next;
 }

 // Utility to compare two ListNodes
 private void assertListEquals(ListNode expected, ListNode actual) {
  while (expected != null && actual != null) {
   assertEquals(expected.val, actual.val);
   expected = expected.next;
   actual = actual.next;
  }
  assertNull(expected);
  assertNull(actual);
 }

 @Test
 public void testExample1() {
  AddTwoNumbersSolver solver = new AddTwoNumbersSolver();
  ListNode l1 = toListNode(new int[]{2, 4, 3});
  ListNode l2 = toListNode(new int[]{5, 6, 4});
  ListNode expected = toListNode(new int[]{7, 0, 8});
  assertListEquals(expected, solver.addTwoNumbers(l1, l2));
 }

 @Test
 public void testExample2() {
  AddTwoNumbersSolver solver = new AddTwoNumbersSolver();
  ListNode l1 = toListNode(new int[]{0});
  ListNode l2 = toListNode(new int[]{0});
  ListNode expected = toListNode(new int[]{0});
  assertListEquals(expected, solver.addTwoNumbers(l1, l2));
 }

 @Test
 public void testExample3() {
  AddTwoNumbersSolver solver = new AddTwoNumbersSolver();
  ListNode l1 = toListNode(new int[]{9,9,9,9,9,9,9});
  ListNode l2 = toListNode(new int[]{9,9,9,9});
  ListNode expected = toListNode(new int[]{8,9,9,9,0,0,0,1});
  assertListEquals(expected, solver.addTwoNumbers(l1, l2));
 }

 @Test
 public void testDifferentLengths() {
  AddTwoNumbersSolver solver = new AddTwoNumbersSolver();
  ListNode l1 = toListNode(new int[]{1});
  ListNode l2 = toListNode(new int[]{9,9,9});
  ListNode expected = toListNode(new int[]{0,0,0,1});
  assertListEquals(expected, solver.addTwoNumbers(l1, l2));
 }

 @Test
 public void testCarryOverLastDigit() {
  AddTwoNumbersSolver solver = new AddTwoNumbersSolver();
  ListNode l1 = toListNode(new int[]{5});
  ListNode l2 = toListNode(new int[]{5});
  ListNode expected = toListNode(new int[]{0,1});
  assertListEquals(expected, solver.addTwoNumbers(l1, l2));
 }
}

