package com.Jai;

public class Build_array_from_permutation {
    public int[] buildArray(int[] nums){
        if (nums.length>=1 && nums.length<=1000) {
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < nums.length) {
                    ans[i] = nums[nums[i]];
                }
            }
            return ans;
        }
        return nums;
    }
}
