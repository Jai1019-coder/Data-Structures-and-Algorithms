package Subset_Subsequence_String;
import java.util.*;
public class RemoveChar2 {
    public static void main(String[] args) {
        String x = "bccadcaah";
        String a = removeChar(x, 3);
        System.out.print(a);
    }
    static String removeChar(String x, int n){
        if (x.isEmpty()) return "";
        char ch = x.charAt(0);
        if (x.startsWith("caa")) return removeChar(x.substring(n), n);
        else {
            return ch + removeChar(x.substring(1),n);
        }
    }
}
