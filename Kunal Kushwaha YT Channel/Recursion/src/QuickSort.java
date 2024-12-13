import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] nums,int low,int high){
        if (low >= high) return;
        int s = low, e = high;
        int m = s+(e-s)/2;
        int pivot = nums[m];
        while(s<=e){
            if (nums[s]>=pivot && nums[e]<=pivot){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            } else if (nums[s]>=pivot) {
                int temp = nums[s];
                nums[s] = pivot;
                pivot = temp;
                s++;
                e--;
            } else if (nums[e]<=pivot) {
                int temp = nums[e];
                nums[e] = pivot;
                pivot = temp;
                s++;
                e--;
            }
            else{
                s++;
                e--;
            }
        }
        quickSort(nums,low,e);
        quickSort(nums,s,high);
    }
}
