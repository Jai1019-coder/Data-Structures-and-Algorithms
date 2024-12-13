/*This code has complexity O(logn) because number of bits in any number is comparable to log of the
* number. Consider noofbits program in this project.*/
import java.util.*;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, magic = 0;
        while(n>0){
            magic = (int) (magic + (int)(n&1)*Math.pow(5,i));
            n = n>>1;
            i++;
        }
        System.out.print(magic);
    }
}
