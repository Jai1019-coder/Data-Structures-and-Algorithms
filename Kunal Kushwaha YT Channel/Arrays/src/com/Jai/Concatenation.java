package com.Jai;

public class Concatenation {
    public int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        if (n>=1 && n<=1000) {
            for (int i = 0; i < 2*n; i++) {
                if (nums[i]>=1 && nums[i]<=1000) {
                    if (i <= n) {
                        ans[i] = nums[i];
                    } else if (i > n && i <= 2*n) {
                        ans[i] = nums[n-i];
                    }
                }
            }
        }
        return ans;
    }
}
