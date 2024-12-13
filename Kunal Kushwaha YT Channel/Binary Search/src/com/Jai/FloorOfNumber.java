package com.Jai;

import java.util.Arrays;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {10,58,45,56,54,52,50,59};
        Arrays.sort(arr);
        int x = 1;
        int ans = ceilingOfNumber(arr, x);
        System.out.println(ans);
    }
    static int ceilingOfNumber(int[] arr, int x){
        int s = 0, e = arr.length-1;
        boolean ascorder;
        if(arr[0] > arr[arr.length-1]) ascorder = false;
        else ascorder = true;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == x) return mid;
            else if(ascorder) {
                if (arr[mid] < x) {
                    s = mid + 1;
                } else e = mid - 1;
            }
            else{
                if(arr[mid] < x) e = mid-1;
                else s = mid+1;
            }
        }
        if (e > 0) {
            return arr[e];
        }
        else{
            return -1;
        }
    }
}
