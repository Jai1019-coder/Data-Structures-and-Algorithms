package com.Jai;
import java.util.Arrays;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] ch = {'c','f','j'};
        System.out.print(smallestletter(ch, 'c'));
    }
    static char smallestletter(char[] letters, char target){
        int s = 0, e = letters.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target < letters[mid]) e = mid - 1;
            else s = mid+1;
        }
//        System.out.println(s);
//        System.out.println(e);
//        System.out.println(letters.length);
        return letters[s%letters.length];
    }

}
