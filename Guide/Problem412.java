package Guide;

/*
 * Fizz Buzz
 */

import java.util.Scanner;

public class Problem412 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number n = ");
            int n = scanner.nextInt();
            String[] result = new String[n+1];
            String fizz = "Fizz", buzz = "Buzz";
            
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        result[i] = fizz + buzz;
                    } else {
                        result[i] = fizz;
                    }
                } else if (i % 5 == 0) {
                    result[i] = buzz;
                } else {
                    result[i] = i + "";
                }
            }
            
            System.out.print("[");
            int len = result.length;
            for (int i = 1; i < len; i++) {
                System.out.print("\"" + result[i] + "\"" + ((i < len - 1) ? ", " : " "));
            }
            System.out.println("]");
        }
    }    
}
