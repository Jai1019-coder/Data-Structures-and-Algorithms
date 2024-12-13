import java.util.*;
public class noofbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the base : ");
        int b = sc.nextInt();
        int bitcount = (int)(Math.log(n)/Math.log(b) + 1);
        System.out.print(bitcount);
    }
}
