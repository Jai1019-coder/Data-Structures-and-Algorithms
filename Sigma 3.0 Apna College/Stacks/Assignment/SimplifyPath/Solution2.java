package Assignment.SimplifyPath;
import java.util.Stack;
import java.util.Scanner;
public class Solution2 {
    static String simplifyPath(String path){
        Stack<Character> s = new Stack<>();
        String pathSimplified = "";
        s.push(path.charAt(0));
        for(int i = 1; i < path.length(); i++){
            char ch = path.charAt(i);
            s.push(ch);
        }
        if (s.peek() == '/') {
            s.pop();
            while (!s.isEmpty()) {
                pathSimplified += popBottom(s);
            }
            return pathSimplified;
        }
        int count = 0;
        if(s.peek() == '.'){
            s.pop();
            count++;
            if (s.peek() == '.') {
                s.pop();
                count++;
            }
        }
        if(count == 1){
            s.pop();
            while (!s.isEmpty()) {
                pathSimplified += popBottom(s);
            }
            return pathSimplified;
        }
        else if(count == 2){
            s.pop();
            while (s.peek() != '/') {
                s.pop();
            }
            while (!s.isEmpty()) {
                pathSimplified+=popBottom(s);
            }
        }
        return pathSimplified;
    }
    static char popBottom(Stack<Character> s){
        Stack<Character> s2 = new Stack<>();
        while(!s.isEmpty()){
            s2.push(s.pop());
        }
        char element = s2.pop();
        while (!s2.isEmpty()) {
            s.push(s2.pop());
        }
        return element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter absolute path of directory : ");
        String path = sc.next();
        sc.close();
        System.out.println(simplifyPath(path));
    }
}
