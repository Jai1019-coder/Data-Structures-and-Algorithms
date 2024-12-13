import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new  String(sc.nextLine());
        StringBuilder strb = new StringBuilder("");
        String a = new String();
        for (int i = 0; i < str.length(); i++) {
//            System.out.println("working");
            if(str.charAt(i) != ' '){
                strb.append(str.charAt(i));
            }
            else{
                strb.reverse();
                a = a+strb+" ";
                strb.delete(i,strb.length()-1);
            }
//            System.out.println("working");;
        }
        System.out.println(a);
    }
}
