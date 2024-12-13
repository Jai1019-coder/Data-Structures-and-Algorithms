import java.util.Stack;

public class PushBottom {
    public static void pushBottom(Stack<Integer> s, int item){
        if(s.isEmpty()){
            s.push(item);
            return;
        }
        int element = (int) s.pop();
        pushBottom(s,item);
        s.push(element);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        pushBottom(s, 4);
        System.out.println(s);
    }
}
