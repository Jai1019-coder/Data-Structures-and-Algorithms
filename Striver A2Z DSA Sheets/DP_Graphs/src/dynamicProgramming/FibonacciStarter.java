package dynamicProgramming;

import java.io.*;

public class FibonacciStarter {
    public static void main(String[] args) {
        int n = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("Enter a number : ");
            bw.flush();
            n = Integer.parseInt(br.readLine());
            br.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Error in handling input");
        }
        Fibonaccii fb = new Fibonaccii();
        long res1 = fb.fibonacciWithDP(n);
        try {
            bw.write(""+String.valueOf(res1)+"\n");
            bw.flush();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Error in handling output");
        }
        
        long res2 = fb.fibonacci(n);
        try {
            bw.write(""+String.valueOf(res2));
            bw.flush();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Error in handling output");
        }
    }
}
