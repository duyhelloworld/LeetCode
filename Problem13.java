import java.util.HashMap;
import java.util.Map;

public class Problem13 {
    public static int romanToInt(String s) {
        Map<String, Integer> letters = new HashMap<>();
        letters.put("I", 1);
        letters.put("V", 5);
        letters.put("X", 10);
        letters.put("L", 50);
        letters.put("C", 100);
        letters.put("D", 500);
        letters.put("M", 1000);
        String[] strs = s.split("");
        int sum = letters.get(strs[0]);
        for (int i = 1; i < strs.length - 1; i++) {
            if (letters.containsKey(strs[i])) {
                int before = letters.get(strs[i]);
                int after = letters.get(strs[i+1]);
                if (before > after) {
                    sum += (before - after);
                } else {
                    sum += (before + after);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String input = "IV";
        System.out.println(romanToInt(input));
    }
}