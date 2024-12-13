package Level1;

import org.w3c.dom.ls.LSOutput;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.print(sumdigits(n));
    }
    static int sumdigits(int n){
        if (n == 0 )return 0;
        return n%10+sumdigits(n/10);
    }
}
