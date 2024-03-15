import java.util.Arrays;

/**
 * Fibonaci
 */
public class Problem1480 {

    public static void main(String[] args) {
        int[] source = { 3, 1, 2, 10, 1 };
        int[] result = new int[source.length];

        result[0] = source[0];
        
        for (int i = 1; i < source.length; i++) {
            for (int j = 0; j <= i; j++) {
                result[i] += source[j];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
