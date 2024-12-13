package com.Jai;
import java.util.Scanner;

import static java.lang.Double.sum;

public class sum {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a = value.nextDouble();
        System.out.print("Enter 2nd number : ");
        double b = value.nextDouble();
        double sum = Sum(a,b);
        System.out.print("Sum is "+sum);
    }
    static double Sum(double a, double b){
        return a+b;
    }
}
