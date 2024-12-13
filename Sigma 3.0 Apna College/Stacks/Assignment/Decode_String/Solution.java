package Assignment.Decode_String;

import java.util.Stack;

public class Solution {
    public static String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int number = 0;
    
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '[') {
                numberStack.push(number);
                stringStack.push(currentString.toString());
                currentString = new StringBuilder();
                number = 0;
            } else if (c == ']') {
                int count = numberStack.pop();
                String prevString = stringStack.pop();
                for (int i = 0; i < count; i++) {
                    prevString += currentString.toString();
                }
                currentString = new StringBuilder(prevString);
            } else {
                currentString.append(c);
            }
        }
    
        return currentString.toString();
    }
    public static void main(String[] args) {
        String expr = "2[a3[c2[x]]y]";
        System.out.print(decodeString(expr));
    }
}