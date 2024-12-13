package InterleaveQueue;
import java.util.*;
public class Solution1 {
    public static void interleave(Queue<Integer> q){
        int n = q.size();
        int arr1[] = new int[n/2];
        int arr2[] = new int[n/2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = q.remove();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = q.remove();
        }
        for (int i = 0; i < n/2; i++) {
            q.add(arr1[i]);
            q.add(arr2[i]);
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
