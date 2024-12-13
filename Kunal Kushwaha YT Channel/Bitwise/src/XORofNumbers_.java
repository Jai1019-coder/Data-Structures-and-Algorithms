import java.util.Scanner;
public class XORofNumbers_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter numbers upto which XOR : ");
        n = sc.nextInt();
        int a = n%4;
        int xor;
        if ((n&1) != 1) xor = (n-a)^(n-a+1)^(n-a+2);
        else xor = (n-a)^(n-a+1)^(n-a+2)^n;
        System.out.println(xor);
    }
}
