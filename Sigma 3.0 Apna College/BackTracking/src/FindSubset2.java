public class FindSubset2 {
    static void findSubset2(String str, StringBuilder ans){
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        char askChar = str.charAt(0);
        findSubset2(str.substring(1),ans.append(askChar));
        ans.deleteCharAt(ans.length()-1);
        findSubset2(str.substring(1),ans);
    }
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder("");
        findSubset2("abc",ans);
    }
}
