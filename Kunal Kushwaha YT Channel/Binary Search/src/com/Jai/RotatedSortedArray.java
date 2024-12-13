package com.Jai;
public class RotatedSortedArray{
    public static  void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        int value = search(arr, target);
        System.out.println(value);
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1) return binarySearch(nums, target , 0, nums.length-1);
//        else if(target >= nums[0]) return binarySearch(nums, target, 0, pivot-1);
//        else return binarySearch(nums, target, pivot+1, nums.length-1);
        return 0;
    }
    public static int findPivot(int[] nums){
        int s = 0, e = nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] > nums[mid+1]) return mid;
            else if (nums[mid] < nums[mid-1]) return mid-1;
            else if(nums[s] >= nums[mid]) e = mid-1;
            else if(nums[s] < nums[mid]) s = mid+1;
            return -1;
        }
        return 0;
    }
    public static int binarySearch(int[] array, int target, int s, int e){
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