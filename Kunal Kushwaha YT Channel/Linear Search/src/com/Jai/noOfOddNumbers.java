package com.Jai;
public class noOfOddNumbers {
    public static void main(String[] args) {
        int[] nums = {18,124,9,17,64,98,1};
        int noOfEven = countEven(nums);
        System.out.println("No of even numbers are "+ noOfEven);
    }
    public static int countEven(int[] arr){
        int count = 0;
        for(int i : arr){
            if(i%2 == 0){
                count++;
            }
        }
        return count;
    }
}
