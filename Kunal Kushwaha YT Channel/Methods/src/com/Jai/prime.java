package com.Jai;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter number to check prime : ");
        int a = value.nextInt();
        num(a);
    }
    static void num(int n){
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count == 0){
            System.out.print("Prime number");
        }
        else {
            System.out.print("Not a prime number");
        }
        return;
    }
}
