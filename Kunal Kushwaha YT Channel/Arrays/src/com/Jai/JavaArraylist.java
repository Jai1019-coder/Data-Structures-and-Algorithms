package com.Jai;
import java.util.*;
public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = 5, d = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                int b = sc.nextInt();
                a.add(b);
            }
            System.out.println("\n");
        }
    }
}
