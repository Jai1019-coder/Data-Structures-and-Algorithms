public class Permutations {
    public static void permutations(String str, String ans){
        if (str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char askChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            permutations(newStr,ans+askChar);
        }
    }
    public static void main(String[] args) {
        permutations("abc","");
    }
}
