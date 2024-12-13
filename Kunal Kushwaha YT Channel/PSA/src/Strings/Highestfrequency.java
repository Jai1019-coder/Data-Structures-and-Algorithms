package Strings;
import java.util.*;
public class Highestfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.print(highestFrequency(a));
    }
    static char highestFrequency(String a){
        int[] count = new int[26];
        String a2 =  a.toLowerCase();
        for (int i = 0; i < a2.length(); i++) {
            count[a2.charAt(i)-'a']++;
        }
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[max]<count[i]) max = i;
        }
        return (char)(max+'a');
    }
}
