import java.util.*;
public class tOGGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder strb = new StringBuilder(sc.next());
        for (int i = 0; i < strb.length(); i++) {
            if (strb.charAt(i)<='Z'){
                strb.setCharAt(i,(char)(strb.charAt(i)+32));
            }
            else strb.setCharAt(i,(char)(strb.charAt(i)-32));
        }
        System.out.print(strb);
    }
}
