package ConnectNRopes;

import java.util.*;

public class Solution {
    public static int connectionCost(int[] arr){
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1+min2;
            pq.add(min1+min2);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        System.out.println(connectionCost(arr));
    }
}
