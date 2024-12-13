package com.Jai;
import java.util.Scanner;

public class voting_age {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int Age = value.nextInt();
        voting(Age);
    }
    static void voting(int age){
        if (age >= 18){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
        return;
    }
}
