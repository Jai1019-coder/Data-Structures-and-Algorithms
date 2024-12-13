package Duplicate_Parantheses;

import java.util.Stack;

public class Solution {
    public static boolean isDuplicate(String str){
        if (str.isEmpty()) {
            return false;
        }
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            s.push(ch);
            if(s.peek() == ')'){
                s.pop();
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count == 0) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String expr = "(((a+(b)))+(c+d))";
        System.out.println(isDuplicate(expr));
    }
}
