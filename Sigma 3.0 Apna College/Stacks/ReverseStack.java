import java.util.Stack;
public class ReverseStack {
    public static void pushBottom(Stack<Integer> s, int item){
        if(s.isEmpty()){
            s.push(item);
            return;
        }
        int element = (int) s.pop();
        pushBottom(s,item);
        s.push(element);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int element = s.pop();
        reverseStack(s);
        pushBottom(s,element);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
