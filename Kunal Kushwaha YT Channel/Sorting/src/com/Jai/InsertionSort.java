package com.Jai;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] nums = {3,43,547,33,4,68,3,57,9,35,8,96,3,46,3,765};
        System.out.println(Arrays.toString(insertion(nums)));
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
    static int[] insertion(int[] arr){
        for (int i = 0; i <= arr.length-1 ; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            j++;
            arr[j] = curr;
        }
        return arr;
    }
}
