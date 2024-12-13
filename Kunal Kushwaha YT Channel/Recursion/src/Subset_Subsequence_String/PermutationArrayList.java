package Subset_Subsequence_String;
import java.util.*;
public class PermutationArrayList {
    public static void main(String[] args){
        String raw = "abc";
        System.out.print(permutations("abc", ""));;
    }
    static ArrayList<String> permutations(String up, String p){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> arrangements = new ArrayList<String>();
        char ch = up.charAt(0);
        for (int i = 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            arrangements.addAll(permutations(up.substring(1), first+ch+last));
        }
        return arrangements;
    }
}
