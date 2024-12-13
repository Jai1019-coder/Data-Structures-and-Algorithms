package com.Jai;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate factorial : ");
        int x = sc.nextInt();
        int factorial = fact(x);
        System.out.print(x+"! = "+factorial);
    }
    static int fact(int a){
        int fact = 1;
        for (int i = 1; i <= a ; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
