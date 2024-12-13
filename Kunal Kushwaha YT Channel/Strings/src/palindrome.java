import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.next());
        StringBuilder b = new StringBuilder(a.substring(0));
        System.out.println(a.reverse().toString().equals(b.toString()));
        System.out.println(a);
        System.out.println(b);
    }
}
