package Subset_Subsequence_String;

public class PermutationCount {
    public static void main(String[] args){
        String raw = "abc";
        System.out.print(permutations("abc", ""));
    }
    static int permutations(String up, String p){
        if (up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            count = count +  permutations(up.substring(1), first+ch+last);
        }
        return count;
    }
}
