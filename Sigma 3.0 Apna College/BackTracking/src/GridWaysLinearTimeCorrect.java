import java.math.BigInteger;
public class GridWaysLinearTimeCorrect {
    public static void main(String[] args) {
        int n = 10, m = 10;
        System.out.print(gridWaysLinearTime(n, m));
    }
    public static BigInteger gridWaysLinearTime(int n, int m) {
        return fact(n - 1 + m - 1).divide(fact(n - 1).multiply(fact(m - 1)));
    }

    public static BigInteger fact(int n) {
        if (n == 0 || n == 1) return BigInteger.ONE;
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
