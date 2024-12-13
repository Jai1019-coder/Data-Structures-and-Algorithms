package com.Jai;
import java.util.Scanner;
public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        pytha(a,b,c);
    }
    static void pytha(int x,int y,int z){
        if((x*x + y*y == z*z) || (z*z + y*y == x*x) || (z*z + x*x == y*y) ){
            System.out.print("Pythagorean Triplets");
        }
        else {
            System.out.print("Not a pythagorean triplet");
        }
        return;
    }
}
