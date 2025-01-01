package LargestSubArraySumZero;

import java.util.HashMap;

public class Solution {
    public static int largestSubArraySumZero(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0, len = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(map.containsKey(sum)){
                len = Math.max(len, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10};
        System.out.println(largestSubArraySumZero(arr));
    }
}
