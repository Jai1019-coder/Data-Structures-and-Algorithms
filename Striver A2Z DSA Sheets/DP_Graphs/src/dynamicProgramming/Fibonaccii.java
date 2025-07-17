package dynamicProgramming;
// import java.util.HashMap;

public class Fibonaccii {
    private int[] dp;
    long fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n-2) + fibonacci(n-1);
    }
    long fibonacciWithDP(int n) {
        dp = new int[n+1];
        return fibo(n);
    }
    private int fibo(int n) {
        if(n <= 1) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = fibo(n-1) + fibo(n-2);
        return dp[n];
    }
}
