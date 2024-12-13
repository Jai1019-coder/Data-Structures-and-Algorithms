import java.util.*;
public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] nums = {8,3,4,12,5,6};
        mergeSort(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }
    static void mergeSort(int[] arr, int s, int e){
        if (e-s==1) return;
        int m = s+(e-s)/2;
        mergeSort(arr, s,m);
        mergeSort(arr, m,e);
        merge(arr,s,m,e);
    }
    static void merge(int[] arr, int s , int m, int e){
        int[] merged = new int[e-s];
        int i = s; int  k = 0;int j=m;
        while(i<m && j<e){/*Not able to merge all elements in all cases of both arrays*/
            if (arr[i]<=arr[j]){
                merged[k] = arr[i];
                i++;
                k++;
            }
            else{
                merged[k] = arr[j];
                j++;
                k++;
            }
        }
        //  Some elements in arrays left if i and j are less then their length of respective arrays copy them as it is.
        for (; i < m; i++) {
            merged[k] = arr[i];
            k++;
        }
        for (; j < e; j++) {
            merged[k] = arr[j];
            k++;
        }
        for (int l = 0; l<merged.length; l++){
            arr[s+l] = merged[l];
        };
    }
}
