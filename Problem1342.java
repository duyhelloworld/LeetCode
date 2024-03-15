import java.util.Scanner;

/**
 * Give integer num, return the number of step to reduce it to zero
 * 
 * CONSTRAINT : 0 <= num <= 10^6
 * 
 * IN  :        n = 14,  8, 0  
 * OUT :            6, 4, 0
 */

public class Problem1342 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number n = ");
            int n = scanner.nextInt();
            int count = 0;
            while (true) {
                if (n == 0) {
                    break;
                }
                if (n % 2 != 0){
                    n = n / 2;
                }
                else {
                    n--;
                }
                count++;
            }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
