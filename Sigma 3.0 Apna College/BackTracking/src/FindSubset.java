public class FindSubset {
    static void findSubset(String str, String ans){
        if(str.isEmpty()) {
            System.out.print(ans + " ");
            if (ans.equals(" ")) {
                System.out.print("NULL");
            }
            return;
        }
        char askChar = str.charAt(0);//accessing the character
        findSubset(str.substring(1),ans+askChar);//asking Yes then add
        findSubset(str.substring(1), ans);//asking No then ignore
    }
    public static void main(String[] args) {
        findSubset("abc","");
    }
}
