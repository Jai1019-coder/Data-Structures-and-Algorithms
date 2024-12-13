package InterleaveQueue;

import java.util.*;

public class Solution {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> q2 = new ArrayDeque<>();
        int n = q.size();
        for (int i = 0; i < n/2; i++) {
            q2.add(q.remove());
        }
        for (int i = 0; i < n/2; i++) {
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        interleave(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
    
}
