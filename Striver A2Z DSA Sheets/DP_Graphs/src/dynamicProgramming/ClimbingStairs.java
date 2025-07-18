package dynamicProgramming;

class InputException extends Exception{
    InputException(String msg){
        super(msg);
    }
}
public class ClimbingStairs {
    private long[] dp;
    /**
     * Computes stairs climbing combinations using brute force approach.
     * This approach has time complexity of O(2^n) and hence is not
     * efficient for large inputs.
     * @param n number of stairs to climb
     * @return number of ways to climb the stairs
     * @since 1.0
     */
    long burteForce(int n) {
        if(n == 1 || n == 2) return n;
        return burteForce(n-2) + burteForce(n-1);
    }
    /**
     * Computes stairs climbing combinations using dynamic programming.
     * 
     * @param n number of stairs to climb
     * @param m mode of DP (0: space optimized, 1: tabulation, 2: memoization)
     * @return number of ways to climb the stairs
     * @throws InputException if mode is invalid
     * @since 1.0
     */
    long dp(int n, int m) throws InputException {
        if(m == 0) {
            return tabulationSpaceOptimised(n);
        }
        dp = new long[n];
        if(m == 1) return tabulation(n);
        else if(m == 2) return memoization(n);
        else throw new InputException("Enter valid inputs");
    }
    private long memoization(int n) {
        if(n == 1 || n == 2) return n;
        if(dp[n-1] != 0) return n;
        return dp[n-1] = memoization(n-2) + memoization(n-1);
    }
    private long tabulation(int n) {
        dp[0] = 1; dp[1] = 2;
        for(int i = 2; i < n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n-1];
    }
    private long tabulationSpaceOptimised(int n) {
        if(n == 1 || n == 2) return n;
        long prev1 = 2, prev2 = 1;
        for (int i = 2; i < n; i++) {
            long curri = prev1+prev2;
            prev2 = prev1;
            prev1 = curri;
        }
        return prev1;
    }
}

