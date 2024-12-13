package com.Jai;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remote = 'Y';
        while(remote == 'Y'){
            System.out.println("Enter the symbol of operation to perform : ");
            char symbol = input.next().charAt(0);
            if (symbol == '+'){
                System.out.println("Enter number 1 : ");
                int num1 = input.nextInt();
                System.out.println("Enter number 2 : ");
                int num2 = input.nextInt();
                System.out.println("Addition is "+(num1 + num2));
            }
            if (symbol == '-'){
                System.out.println("Enter number 1 : ");
                int num1 = input.nextInt();
                System.out.println("Enter number 2 : ");
                int num2 = input.nextInt();
                System.out.println("Addition is "+(num1 - num2));
            }
            if (symbol == '*'){
                System.out.println("Enter number 1 : ");
                int num1 = input.nextInt();
                System.out.println("Enter number 2 : ");
                int num2 = input.nextInt();
                System.out.println("Addition is "+(num1 * num2));
            }
            if (symbol == '/'){
                System.out.println("Enter number 1 : ");
                int num1 = input.nextInt();
                System.out.println("Enter number 2 : ");
                int num2 = input.nextInt();
                System.out.println("Addition is "+(num1 / num2));
            }
            System.out.println("Continue?");
            remote = input.next().charAt(0);
        }
    }
}
