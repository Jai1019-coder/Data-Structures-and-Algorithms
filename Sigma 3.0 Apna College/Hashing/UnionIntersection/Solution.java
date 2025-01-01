package UnionIntersection;

import java.util.HashSet;

public class Solution {
    public static int union(int[] nums1,int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            set.add(i);
        }
        return set.size();
    }
    public static int intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        int count = 0;
        for (int i : nums2) {
            if(set.contains(i)){
                count++;
                set.remove(i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }
}
