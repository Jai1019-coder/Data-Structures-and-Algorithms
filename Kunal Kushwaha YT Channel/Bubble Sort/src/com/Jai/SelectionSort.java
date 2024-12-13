package com.Jai;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        seletion(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void seletion(int[] arr){
//        for (int i = 0; i < arr.length-1; i++) {
            int max = 0;
            for (int j = 1; j < arr.length-i; j++) {
                 max = j;
                if (arr[max] < arr[j - 1]) max = j - 1;


            }
//            int last = arr.length-i-1;
//            int t = arr[last];
//            arr[last] = arr[max];
//            arr[max] = t;
        }
        System.out.println(max);

    }
}
