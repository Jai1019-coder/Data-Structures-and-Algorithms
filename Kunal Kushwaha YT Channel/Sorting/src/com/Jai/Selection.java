package com.Jai;
import java.util.Arrays;
public class Selection {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] nums = {3,43,547,33,4,68,3,57,9,35,8,96,3,46,3,765};
        System.out.println(Arrays.toString(selection(nums)));
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
    static int[] selection(int nums[]){
        for (int i = 0; i <= nums.length-2; i++) {
            int min = i;
            for (int j = i+1; j <= nums.length-1; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int t = nums[i];
            nums[i] = nums[min];
            nums[min] = t;
        }
        return nums;
    }
}
