package Arrays;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        selection(nums, nums.length-1,0, 0);
        System.out.println(Arrays.toString(nums));
    }
    static void selection(int[] arr, int r ,int c, int max){
        if (r==0) return;
        if (c<=r){//Travercing in each row.
            //Updating maximum if needed
            if (arr[max]<=arr[c]){
                max = c;
            }
            // Traversing in row
            selection(arr, r, c+1, max);
        }
        //c = 4
        else{
            //swapping to last index c = 3
            int t = arr[c-1];
            arr[c-1] = arr[max];
            arr[max] = t;
            //Change of pass
            selection(arr, r-1,0,0);
        }
    }
}
