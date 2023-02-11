package Guide;

import java.util.Scanner;

public class Problem1342 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number n = ");
            int n = scanner.nextInt(), count = 0;

            while (n != 0) {
                count++;
                n = n / 2;
            }
                // if (n % 2 == 0) {
                    // count++;
                    // n = n % 2;
                // } else {
                // }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
