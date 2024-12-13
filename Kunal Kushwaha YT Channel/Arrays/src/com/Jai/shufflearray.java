package com.Jai;
import java.util.ArrayList;
import java.util.Arrays;

public class shufflearray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = arr.length/2;
//        Dividing arr in two parts.
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length/2];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        for (int i = n; i < arr.length ; i++) {
            arr2[i-n] = arr[i];
        }
//        Shuffling arr2 in arr1.
        for (int i = 0; i < n ; i++) {
            int t = arr[n-i-1];
            arr1[n-i-1] = arr2[i];
            int u = arr1[n-i];
            arr1[n-i] = arr1[n-i-1];
            arr1[n-i+1] = arr1[n-i];
        }
        System.out.println(Arrays.toString(arr1));
    }

}
