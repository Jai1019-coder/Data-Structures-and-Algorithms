package dynamicProgramming;

public class Fibonaccii {
    private class FibException extends Exception{
        FibException(String message){
            super(message);
        }
    }
    private int[] dp;
    long fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n-2) + fibonacci(n-1);
    }
    long fibonacciWithDP(int n, int m)throws FibException {
        dp = new int[n+1];
        if(m == 0) return fibMemo(n);
        else if (m == 1) return fibTab(n);
        else throw new FibException("Invalid mode input for fibonacci calculation");
    }
    private int fibMemo(int n) {
        if(n <= 1) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = fibMemo(n-1) + fibMemo(n-2);
        return dp[n];
    }
    private int fibTab(int n) {
        dp[0] = 0;dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
    long fibTabSpaceOptimised(int n) {
        if(n == 0 || n == 1) return n;
        long prev2 = 0, prev1 = 1;
        for(int i = 0; i <= n; i++) {
            long curri = prev2 + prev1;
            prev2 = prev1;
            prev1 = curri;
        }
        return prev1;
    }
}
