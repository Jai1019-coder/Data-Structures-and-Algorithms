package Subset_Subsequence_String;

import java.util.ArrayList;

public class SubsequenceASCII {
    public static void main(String[] args) {
        System.out.print(subset("abc", ""));
    }
    static ArrayList<String> subset(String raw, String processed){
        if (raw.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(processed);
            return list;
        }
        char ch = raw.charAt(0);
        ArrayList<String> left = subset(raw.substring(1), processed+ch+(int)ch);
        ArrayList<String> right = subset(raw.substring(1), processed);
        left.addAll(right);
        return left;
    }
}

