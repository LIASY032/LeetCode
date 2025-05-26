/**
 * @author: Jack Liang
 * @date: 15/5/2025
 */

public class ReverseIntegerSolver {
    public int reverse1(int i) {
        int result = 0;
        while (i != 0) {
            result = result * 10 + i % 10;
            i /= 10;
        }
        return result;
    }

    public int reverse(int i) {
        if (i == Integer.MIN_VALUE || i == Integer.MAX_VALUE) return 0; // Handle edge case for Integer.MIN_VALUE
        try {
            String result = i > 0 ? "" : "-";
            String str = String.valueOf(i).replace("-", "");
            for (int j = str.length() - 1; j >= 0; j--) {
                result += str.charAt(j);
            }
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0; // Return 0 if the reversed number exceeds the range of int
        }

    }
}
