package Level1;
import java.util.*;
public class NumberOfStepstoReduceANumberToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(stepsToZero(n, 0));
    }
    static int stepsToZero(int n, int count){
        if (n%2==0 && n>0) return stepsToZero(n/2, count+1);
        else if(n%2!=0) return stepsToZero(n-1, count+1);
        else return count;
    }
}
