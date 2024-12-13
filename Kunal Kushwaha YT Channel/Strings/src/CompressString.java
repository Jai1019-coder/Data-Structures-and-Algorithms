import java.util.*;
public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String(sc.next());
        String str2 = str+"  ";
        StringBuilder strb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str2.length()-1; i++) {
            if(str2.charAt(i) == str2.charAt(i-1)){
                count++;
            }
            else{
                strb.append(str2.charAt(i-1));
                if (str2.charAt(i-1) == str2.charAt(i-2)) strb.append(count);
                count=1;
            }
        }
        System.out.print(strb);
    }
}
