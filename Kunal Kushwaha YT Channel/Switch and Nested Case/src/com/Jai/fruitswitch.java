package com.Jai;
import java.util.Scanner;

public class fruitswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("Mango");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Banana" -> System.out.println("Radioactive fruit");
            default -> {
            }
        }
    }
}
