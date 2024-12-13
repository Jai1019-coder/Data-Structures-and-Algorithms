import java.util.*;
public class LengthOfStringRecursion {
    public static void main(String[] args) {
        String str = "Java IntelliJ";
        System.out.print(lenStr(str));
    }
    static int lenStr(String str){
        if(str.equals("")) return 0;
        return lenStr(str.substring(1))+1;
    }
}
