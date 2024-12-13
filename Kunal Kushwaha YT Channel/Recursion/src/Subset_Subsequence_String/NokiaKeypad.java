package Subset_Subsequence_String;
import java.util.*;
public class NokiaKeypad {
    public static void main(String[] args) {
        String up = "23";
        System.out.println(keypad(up));;
    }

    static ArrayList<String> keypad(String up) {
        String p = "";
        if (up.isEmpty()){
            ArrayList<String> lst = new ArrayList<String>();
            lst.add(p);
            return lst;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> last = new ArrayList<>();
        if (digit != 7 && digit != 9) {
            for (int i = 3 * (digit - 2) + 1; i <= 3 * (digit - 1); i++) {
                p = p + (char)(96 + digit);
                last.add(p+keypad(up.substring(1)));
            }
        } else if (digit == 7) {
            for (int i = 3 * (digit - 2) + 1; i <= 3 * digit - 2; i++) {
                p = p + (char)(96 + digit);
                last.add(p+keypad(up.substring(1)));
            }
        } else {
            for (int i = 3 * (digit - 2) + 2; i <= 3 * digit - 1; i++) {
                p = p + (char)(96 + digit);
                last.add(p+keypad(up.substring(1)));
            }
        }
        return last;
    }
}