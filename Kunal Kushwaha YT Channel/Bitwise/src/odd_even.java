import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n&1) == 1){
            System.out.println("Odd");
        }
        else System.out.println("Even");
    }
}
