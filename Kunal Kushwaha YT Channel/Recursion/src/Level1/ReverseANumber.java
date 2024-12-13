package Level1;

public class ReverseANumber {
    static int sum = 0;
    public static void main(String[] args) {
        int n = 1234;
        reverse(n);
        n = sum;
        System.out.print(n);
    }
    static int reverse(int n)/*n = 1234*/{
        if (n == 0) return 0;
        sum = sum*10+n%10;
        reverse(n/10);
        return 0;
    }
}
