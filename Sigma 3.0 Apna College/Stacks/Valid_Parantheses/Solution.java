package Valid_Parantheses;

import java.util.Stack;

class Solution {
    public static boolean validParantheses(String prnthses){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < prnthses.length(); i++) {
            char ch = prnthses.charAt(i);
            // opening bracket detected
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            else{
                // closing bracket detected
                if (s.isEmpty()) {
                    //if prnthses start with closing 
                    return false;
                }
                // pair matching condition
                else if ((ch == ']' && s.peek() == '[')||(ch == '}' && s.peek() == '{')||
                (ch == ')' && s.peek() == '(')){
                    s.pop();
                }
                else return false;

            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String prnthses = "[}]";
        System.out.println(validParantheses(prnthses));
        
    }
}
