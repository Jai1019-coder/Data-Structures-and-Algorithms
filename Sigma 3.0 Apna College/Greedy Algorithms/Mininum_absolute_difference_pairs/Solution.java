package Mininum_absolute_difference_pairs;

import java.util.Arrays;

public class Solution {
    public static int minDiffSum(int A[], int B[]){
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiffSum = 0;
        for (int i = 0; i < B.length; i++) {
            minDiffSum += Math.abs(A[i]-B[i]);
        }
        return minDiffSum;
    }
    public static void main(String[] args) {
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5};
        System.out.println(minDiffSum(A, B));
    }
}
