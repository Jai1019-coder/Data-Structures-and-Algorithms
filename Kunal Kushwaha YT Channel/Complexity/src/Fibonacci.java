import java.util.Scanner;

public class Fibonacci {
    static long fiboFormula(int n){
        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fibo = fiboFormula(n);
        System.out.print(fibo);
    }
}
