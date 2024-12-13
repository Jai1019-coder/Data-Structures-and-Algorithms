package Subset_Subsequence_String;
import java.util.*;
public class removeachar {
    public static void main(String[] args) {
        String x = "baccad";
        removeChar(x, 'a', 0);
        System.out.print(a);
    }
    static String a = "";
    static void removeChar(String x, char y, int i){
        if (i == x.length()) return;
        if (x.charAt(i) == 'a') removeChar(x,y,++i);
        else{
            a = a+x.charAt(i);
            removeChar(x,y,++i);
        }
    }
}
