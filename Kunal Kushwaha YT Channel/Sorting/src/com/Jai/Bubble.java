package com.Jai;
import java.util.*;
public class Bubble {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] nums = {3,43,547,33,4,68,3,57,9,35,8,96,3,46,3,765};
        System.out.println(Arrays.toString(bubble(nums)));
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
    static int[] bubble(int[] nums){
        for (int i = 0; i <= nums.length-2; i++) {
            for (int j = 1; j <= nums.length-i-1 ; j++)
            {
                if (nums[j-1]>nums[j]){
                    int t = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = t;
                }
            }
        }
        return nums;
    }
}
