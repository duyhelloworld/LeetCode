public class Problem9 {
    public static boolean isPalindrome(int x) {
        if (x < 10) {
            return false;
        }

        // int sum = 0;
        // while (x > 0) {
        //     sum = sum * 10 + x % 10;
        //     x /= 10;
        // }
        // return sum == x;

        int sum = 0;
        for (int i = x; i > 0; i /= 10) {
            sum = sum * 10 + i % 10;
        }
        return sum == x;
    }
    public static void main(String[] args) {
        int x = 1234;
        System.out.println(isPalindrome(x));
    }
}
