package com.Jai;

public class maximum {

    public static void main(String[] args) {
        max(3, 10, 100);
        min(3,10, 100);
    }

    static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Greatest is " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Greatest is "+b);
        } else if (c > a && c > b) {
            System.out.println("Greatest is "+c);
        }
        return;
    }
    static void min(int x, int y, int z) {
        if (z < x && z < y) {
            System.out.println("Smallest is " +z);
        }
        else if (y < x && y < z) {
            System.out.println("Smallest is "+y);
        } else if (x < y && x < z) {
            System.out.println("Smallest is "+x);
        }
        return;
    }
}

