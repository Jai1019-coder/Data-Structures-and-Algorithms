package com.Jai;
import java.util.Arrays;
public class BSinMatrix {
    public static void main(String[] args) {
        int[][] arr = {{20,30},{25,35},{29,37},{34,38}};
        int[] ans = search(arr, 100);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        int r = 0, c = arr[r].length-1;
        while(r<arr.length && c >= 0){
            if(arr[r][c] == target) return new int[]{r,c};
            else if(arr[r][c] > target) c--;
            else r++;
        }
        return new int[] {-1,-1};
    }
}
