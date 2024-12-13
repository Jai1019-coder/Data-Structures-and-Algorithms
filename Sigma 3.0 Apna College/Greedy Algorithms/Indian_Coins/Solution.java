package Indian_Coins;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount){
        Arrays.sort(coins);
        int count = 0;
        for(int i = coins.length-1; i>=0; i--){
            if(coins[i] <= amount){
                while(coins[i]<=amount){
                    count++;
                    amount-=coins[i];
                }
            }
        }
        if(amount == 0){
            return count;
        }else{
            return -1;
        }
    }
    public void main(String[] args) {
        int[] arr = {2000,500,100,50,20,10,2,1};
        System.out.println(coinChange(arr, 590));
    }
}
