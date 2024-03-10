import java.math.BigInteger;

public class Problem70 {

    public static BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) == -1) {
            return BigInteger.ONE;
        }
        return factorial(n.subtract(BigInteger.ONE)).multiply(n);
    }

    public static int climbStairs(int n) {
        BigInteger result = BigInteger.ZERO;
        BigInteger length = BigInteger.valueOf(n);
        BigInteger soSo2 = BigInteger.ZERO;

        while (length.compareTo(BigInteger.ZERO) == 1) {
            result = result.add(factorial(length).divide(
                (factorial(soSo2).multiply(factorial(length.subtract(soSo2))))));
            soSo2.add(BigInteger.ONE);
            length.subtract(BigInteger.ONE);
        }
        return result.intValue();
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(35));
    }
}
