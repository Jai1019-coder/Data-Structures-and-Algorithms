package CountDistinctElements;

import java.util.HashSet;

public class Solution {
    public static int countDistinctElements(int[] arr){
        if(arr.length == 0 || arr.length == 1) return arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) { 
        int nums[] = {1,2,3,4,5,1,2,7,6};
        System.out.println(countDistinctElements(nums));
    }
}
