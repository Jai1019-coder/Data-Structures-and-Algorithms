import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {8,3,4,12,5,6};
        int [] sorted = mergeSort(nums);
        System.out.println(Arrays.toString(sorted));
    }
    static int[] mergeSort(int[] arr){
        if (arr.length == 1) return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] l, int[] r){
        int[] merged = new int[l.length+r.length];
        int i = 0; int  k = 0;int j = 0;
        while(i<l.length && j<r.length){/*Not able to merge all elements in all cases of both arrays*/
            if (l[i]<=r[j]){
                merged[k] = l[i];
                i++;
                k++;
            }
            else{
                merged[k] = r[j];
                j++;
                k++;
            }
        }
        //  Some elements in arrays left if i and j are less then their length of respective arrays copy them as it is.
        for (; i < l.length; i++) {
            merged[k] = l[i];
            i++;
            k++;
        }
        for (; j < r.length; j++) {
            merged[k] = r[j];
            j++;
            k++;
        }
        return merged;
    }
}
