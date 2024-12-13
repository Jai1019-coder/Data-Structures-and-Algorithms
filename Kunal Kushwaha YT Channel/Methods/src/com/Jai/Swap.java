package com.Jai;

public class Swap {
    public static void main(String[] args) {
        float num1 = 12.5f;
        float num2 = 24.8f;

        // Call the user-defined function to swap numbers
        swapNumbers(num1, num2);
        System.out.println(num1);
        System.out.println(num2);

    }
    public static void swapNumbers(float a, float b) {
        System.out.println("--Before swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        // Swap logic without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
