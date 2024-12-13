import java.util.*;
public class SubstringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder strb = new StringBuilder(sc.next());
        int count = 0;
        for (int i = 0; i <= strb.length()-1; i++) {
            for (int j = i+1; j <= strb.length(); j++) {
                StringBuilder b = new StringBuilder(strb.substring(i,j));
                if (palindrome(b)) count++;
            }
        }
        System.out.print(count);
    }

    static boolean palindrome(StringBuilder b) {
        StringBuilder c = new StringBuilder(b);
        return (b.reverse()).compareTo(c)==0;
    }
}

