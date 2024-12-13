import java.util.Stack;
public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        str = "";
        int n = st.size();
        for (int i = 0; i < n; i++) {
            str += st.pop();
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "hello";
        String s2 = reverseString(s);
        System.out.println(s2);

    }
}
