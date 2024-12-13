package com.Jai;

public class Prime2 {
    public static void main(String[] args) {
        prime(1, 100);
    }
    static void prime(int a, int b){
        for (int i = a; i <= b; i++) {
            if (i == 0 || i == 1){
                continue;
            }
            int count = 1;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    count = 0;
                    break;
                }
            }
            if (count == 1){
                System.out.println(i);
            }
        }
        return;
    }
}
