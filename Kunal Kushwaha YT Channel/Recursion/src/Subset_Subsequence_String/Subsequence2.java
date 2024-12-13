package Subset_Subsequence_String;

public class Subsequence2 {
    public static void main(String[] args) {
        String input = "abc";
        subset(input,"");
    }
    static void subset(String raw, String processed){
        if (raw.isEmpty()){
            System.out.print(processed+" ");
            return;
        }
         char ch = raw.charAt(0);
        subset(raw.substring(1),processed+ch);
        subset(raw.substring(1),processed);
    }
}
