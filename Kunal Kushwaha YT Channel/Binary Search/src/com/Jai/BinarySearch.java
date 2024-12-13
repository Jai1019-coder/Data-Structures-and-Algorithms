package com.Jai;

public class BinarySearch {
    public static void main(String[] args){
        int[] x = {1};
        int ans = binarySearch(x, 1);
        System.out.println(ans);
    }
    static int binarySearch(int[] array, int target){
        int s = 0, e = array.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(array[mid] == target){
                return mid;
            }
            else if (array[mid] < target) {
                s = mid+1;
            }
            else e = mid-1;
        }
        return -1;
    }
}
