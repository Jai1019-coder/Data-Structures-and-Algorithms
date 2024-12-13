package com.Jai;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        grades(marks);
    }
    static void grades(int marks){
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade A");
        }
        else if (marks >= 81 && marks <= 90){
            System.out.println("Grade AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade DD");
        } else if (marks <= 40) {
            System.out.println("Fail");
        }
        else System.out.println("Enter correct marks");
        return;
    }
}
