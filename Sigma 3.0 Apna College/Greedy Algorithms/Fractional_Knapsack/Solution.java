package Fractional_Knapsack;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50, capacity = W, value = 0;
        double itemRatio[][] = new double[weight.length][2];
        for (int i = weight.length-1; i >= 0 ; i--) {
            itemRatio[i][0] = i;
            itemRatio[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(itemRatio, Comparator.comparingDouble(o -> o[1]));
        for (int j = itemRatio.length-1; j>=0; j--) {
            int idx = (int)itemRatio[j][0];
            if(weight[idx] <= capacity){
                value += val[idx];
                capacity-= weight[idx];
            }else{
                value+=itemRatio[j][1]*capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println(value);
    }
}
