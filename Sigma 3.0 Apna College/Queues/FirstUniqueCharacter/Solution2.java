package FirstUniqueCharacter;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        String str = "aabccxb";
        int freqArray[] = new int[26];
        Queue<Character> q = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqArray[ch-'a']++;
            q.add(ch);
            while (!q.isEmpty() && freqArray[q.peek()-'a'] != 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.println(-1);
            }
            else{
                System.out.println(q.peek());
            }
        }
    }
}
