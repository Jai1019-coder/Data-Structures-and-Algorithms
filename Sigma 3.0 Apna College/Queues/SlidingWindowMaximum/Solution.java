package Queues.SlidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    // Brute Force Approach
    public static int[] maxSlidingWindow1(int[] nums, int k){
        int n = nums.length;
        int[] result = new int[n-k+1];
        for(int i = 0; i <= n-k; i++){
            int max = nums[i];
            for(int j = i; j < i+k; j++){
                if (max < nums[j]) {
                    max = nums[j];
                }
            }
            result[i] = max;
        }
        return result;
    }
    // O(N) approach
    public static int[] maxSlidingWindow2(int[] nums, int k){
        int n = nums.length;
        int result[] = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.getFirst() <= i-k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && nums[dq.getLast()] <= nums[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            if(i >= k-1) {
                result[i-(k-1)] = nums[dq.getFirst()];
            }
        }
        return result;
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for new line
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow2(nums, k);
        printArray(result);
    }    
}
