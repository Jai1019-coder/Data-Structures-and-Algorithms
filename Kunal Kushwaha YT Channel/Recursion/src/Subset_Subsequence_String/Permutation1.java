package Subset_Subsequence_String;

public class Permutation1 {
    public static void main(String[] args){
        String raw = "abc";
        permutations("abc", "");
    }
    static void permutations(String up, String p){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            permutations(up.substring(1), first+ch+last);
        }

    }
}
