package com.Jai;

public class OrderAgnostic {
    public static void main(String[] args){
        int[] x = {89, 81, 78, 56, 45, 10, 9, 6, 4, 2, 1, -9, -18, -38, -45, -66};
        int[] y = {-66, -45, -38, -18, -9, 1, 2, 4, 6, 9, 10, 45, 56, 78, 81, 89};

        int ans1 = binarySearch(x, 45), ans2 = binarySearch(y, 45);
        System.out.println(ans1+','+ans2);
        System.out.println(ans2);
    }
    static int binarySearch(int[] array, int target){
        int s = 0, e = array.length-1, f = array[0], l = array[array.length-1];
        while(s<=e){
            int mid = s + (e-s)/2;
            if(array[mid] == target){
                return mid;
            }
            else if (array[mid] < target) {
                if(f<l) /*ascending*/ s = mid+1;
                else if(f>l)/*descending*/ e = mid-1;
            }
            else if (array[mid]>target) {
                if(f<l)/*ascending*/ e = mid-1;
                else if(f>l)/*descending*/ s = mid+1;
            }
        }
        return -1;
    }
}
