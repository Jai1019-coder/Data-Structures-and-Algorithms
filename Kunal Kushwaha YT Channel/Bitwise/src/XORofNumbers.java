import java.util.*;
public class XORofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers upto which you wanna XOR : ");
        int n = sc.nextInt();
        int xOR= xor(n);
        System.out.print(xOR);
    }
    static int xor(int n){
        if (n == 0) return 0;
        return n^xor(--n);
    }
}
