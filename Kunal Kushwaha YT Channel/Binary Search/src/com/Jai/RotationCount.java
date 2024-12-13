package com.Jai;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        System.out.println(rotationcount(arr));
    }
    static int rotationcount(int[] nums){
        int pivot = findPivot(nums);
        return pivot+1;
    }
    static int findPivot(int nums[]){
        int s = 0, e = nums.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid < e && nums[mid] > nums[mid+1]) return mid;
            else if(mid > s && nums[mid] < nums[mid-1]) return mid-1;
            else if(nums[s] > nums[mid] ) e = mid -1;
            else s = mid+1;
        }
        return -1;
    }
}
