package Level1;
import java.util.*;
public class ReverseDigitSum {
    public static void main(String[] args) {
        System.out.println( superDigit("148",3));
    }
    static int superDigit(String n, int k) {
        // Write your code here
        if(n.length()==1)return Integer.parseInt(n);
        String temp = "";
        if(k>0){
            for(int i = k; i>0;i--){
                temp+=n;
            }
        }
        String sumdigit = "";
        int num = Integer.parseInt(temp);
        while(num>0){
            sumdigit = sumdigit+num%10;
            num/=10;
        }
        return superDigit(sumdigit,0);
    }

}
