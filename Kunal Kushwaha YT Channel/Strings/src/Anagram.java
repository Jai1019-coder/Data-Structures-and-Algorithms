import java.util.*;
public class Anagram {
    static boolean isAnagram(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        int temp = 0;
        int ch[] = new int[26];
        for (int i = 0; i < a1.length(); i++) {
            ch[a1.charAt(i)-'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            ch[b1.charAt(i)-'a']--;
        }
        for (int i : ch) {
            if(i != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
