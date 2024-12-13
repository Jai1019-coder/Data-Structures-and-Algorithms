package Level1;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.print(digitproduct(n));
    }
    static int digitproduct(int n){
        if (n == 1 )return n;
        return n%10*digitproduct(n/10);
    }
}
