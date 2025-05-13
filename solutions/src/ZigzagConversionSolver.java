import java.util.Map;

/**
 * @author: Jack Liang
 * @date: 12/5/2025
 */

public class ZigzagConversionSolver {
    public String convert(String s, int numRows) {
        if (numRows==1) return s;
        Map<Integer, String> map = new java.util.HashMap<>();
        for (int i = 0; i < numRows; i++) {
            map.put(i, "");
        }
        int direction = 1;
        int currentRow = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(currentRow, map.get(currentRow) + s.charAt(i));
            currentRow += direction;
            if (currentRow == numRows - 1 || currentRow == 0) {
                direction *= -1;
            }
        }
        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += map.get(i);
        }
        return result;
    }
}
