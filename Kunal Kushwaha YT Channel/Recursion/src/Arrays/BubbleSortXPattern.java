package Arrays;
import java.util.*;
public class BubbleSortXPattern {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        bubble(nums, nums.length-1,1);
        System.out.print(Arrays.toString(nums));
    }
    static void bubble(int[] arr, int r, int c){
        if (r == 0) return;
        if (c<=r){//To make the recursion for same pass.
            if (arr[c] < arr[c-1]){
                //swapping
                int t = arr[c];
                arr[c] = arr[c-1];
                arr[c-1] = t;
            }
            //Putting maximum element to end of unsorted part.
            bubble(arr, r,c+1);
        }
        else{
            //Change of pass
            bubble(arr, r-1, 1);
        }
    }
}
