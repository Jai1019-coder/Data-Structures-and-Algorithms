package com.Jai;
import java.util.Arrays;
public class CountSort {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] nums = {3,43,547,33,4,68,3,57,9,35,8,96,3,46,3,765};
        System.out.println(Arrays.toString(countsort(nums)));
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
    static int[] countsort(int[] arr){
        int max = max(arr);
        int[] output = new int[arr.length];
        int[] count = new int[max+1];
        for (int i: arr) {
            count[i]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }
        for (int i = arr.length-1; i >= 0 ; i--) {
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        return output;
    }
    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}