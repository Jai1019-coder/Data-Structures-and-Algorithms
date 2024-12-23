package HeapSort;

import java.util.*;

public class Solution {
    public static void heapifyUp(int[] arr, int i, int size){
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int maxIdx = i;
        if(leftChild < size && arr[leftChild] > arr[maxIdx]){
            maxIdx = leftChild;
        }
        if(rightChild < size && arr[rightChild] > arr[maxIdx]){
            maxIdx = rightChild;
        }
        if (maxIdx != i) {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
            heapifyUp(arr, maxIdx,i);
        }
    }
    public static void heapSort(int[] arr){
        int n = arr.length;
        for(int i = n/2; i >= 0; i--){
            heapifyUp(arr, 0, i);
        }
        for(int i = n-1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyUp(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}