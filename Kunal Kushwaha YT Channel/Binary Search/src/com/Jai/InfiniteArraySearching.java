package com.Jai;
import java.util.Arrays;

public class InfiniteArraySearching {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 210;
        System.out.println(ans(nums, target));
    }
    static int ans (int[] arr, int target){
        int s = 0, e = 1;
        int size = (e-s)+1;
        while(target > arr[e]){
            s = 2*(size-1);
            size*=2;
            e = (s+size)-1;
        }
        return binarysearch(arr, target, s ,e);
    }
    static int binarysearch(int[] arr, int target, int s, int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target < arr[mid]) e = mid-1;
            else if(target > arr[mid]) s = mid + 1;
            else {
                return mid;
            }
        }
        return target;
    }
}
//Index will not be out of bound because array is infinite.