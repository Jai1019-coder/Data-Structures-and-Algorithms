package WeakestSoldier;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static class Rows implements Comparable<Rows>{
        String name;
        int soldierCount;
        int idx;
        Rows(String name,int soldierCount,int idx){
            this.name = name;
            this.soldierCount = soldierCount;
            this.idx = idx;
        }
        @Override
        public int compareTo(Rows r2){
            return this.soldierCount-r2.soldierCount;
        }
    }
    public static List<Rows> weakestRows(int[][] strength, int k){
        PriorityQueue<Rows> pq = new PriorityQueue<>();
        List<Rows> weakRows = new ArrayList<>();
        for (int i = 0; i < strength.length; i++) {
            int sum = 0;
            for (int j = 0; j < strength[i].length; j++) {
                sum+=strength[i][j];
            }
            pq.add(new Rows("row"+i,sum,i));
        }
        for(int i = 0; i < k; i++){
            weakRows.add(pq.remove());
        }
        return weakRows;
    }
    public static void main(String[] args) {
        int strength[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;
        List<Rows> weakRows = weakestRows(strength, k);
        for (int i = 0; i < weakRows.size(); i++) {
            System.out.println(weakRows.get(i).name);
        }
    }
}
