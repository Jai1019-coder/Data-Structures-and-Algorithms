package com.Jai;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r = inp.nextDouble();
        double perimeter = circumference(r);
        double area = area(r);
        System.out.println("Circumference is "+perimeter);
        System.out.print("Area is "+area);
    }
    static double circumference(double r){
        return 2*(22/7.0)*r;
    }
    static double area(double r){
        return (22/7.0)*r*r;
    }
}
