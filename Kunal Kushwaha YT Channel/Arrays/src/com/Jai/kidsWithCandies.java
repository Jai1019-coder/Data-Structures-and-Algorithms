package com.Jai;
import java.util.ArrayList;
class kidsWithCandies {
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i : candies){
            if(i >= max){
                max = i;
            }
        }
        for(int i:candies){
            result.add(i+extraCandies >= max);
        }
//        System.out.println(max);
        return result;
    }

    public static void main(String[] args) {
        ArrayList <Boolean> arr = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println(arr);
    }
}
