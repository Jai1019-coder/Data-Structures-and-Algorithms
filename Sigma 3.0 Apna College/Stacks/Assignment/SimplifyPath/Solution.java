package Assignment.SimplifyPath;

import java.util.*;

public class Solution {
    public static String simplifyPath(String path) {
        char arr[] = path.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
    public static void main(String[] args) {
        String path = "/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(path));
    }
}
