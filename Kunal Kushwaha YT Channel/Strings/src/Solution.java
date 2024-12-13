import java.util.Scanner;

public class Solution {

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i < s.length(); i++) {
            String a = "";
            String b = "";
            for (int j = i+1; j <= s.length(); j++) {
                if (j-i == k) {
                    a = s.substring(i,j);
                    if (smallest.compareTo(a)>0) {
                        smallest = a;
                        System.out.println("Smallest = "+smallest);
                        System.out.println(j);
                    }
                    System.out.println(j);
                }
            }
            for (int l = i+1; l < s.length(); l++) {
                if (l-i == k){
                    largest = b;
                    b = s.substring(i,l);
                    if (largest.compareTo(b)<0){
                        largest = b;
                        System.out.println("Largest = "+largest);
                    }
                }
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        System.out.println(largest);
        System.out.println(smallest);
//        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        getSmallestAndLargest(s, k);
    }
}