package SlidingWindowMaximum;

import java.util.PriorityQueue;

public class Solution {
    public static class Value implements Comparable<Value>{
        int no;
        int idx;
        Value(int no, int idx){
            this.no = no;
            this.idx = idx;
        }
        @Override
        public int compareTo(Value val2){
            //ascending 
            //return this.no-val2.no
            //descending
            return val2.no-this.no;
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k){
        PriorityQueue<Value> pq = new PriorityQueue<>();
        int n = nums.length;
        int result[] = new int[n-k+1];
        for (int i = 0; i < k; i++) {
            pq.add(new Value(nums[i], i));
        }
        result[0] = pq.peek().no;
        for (int i = k; i < nums.length; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= (i-k)) {
                pq.remove();
            }
            //First add in pq so that values get sorted internally and we get correct result
            pq.add(new Value(nums[i], i));
            //i-k+1 because we've already added at index 0
            result[i-k+1] = pq.remove().no;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int result[] = maxSlidingWindow(arr, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
