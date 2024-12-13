package com.Jai;

public class BinarySearchDsc {
    public static void main(String[] args){
        int[] x = {89, 81, 78, 56, 45, 10, 9, 6, 4, 2, 1, -9, -18, -38, -45, -66};
        int ans = binarySearch(x, 45);
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
                e = mid-1;
            }
            else s = mid+1;
        }
        return -1;
    }
}
