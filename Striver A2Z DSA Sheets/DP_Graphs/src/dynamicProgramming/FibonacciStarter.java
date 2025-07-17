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
        try {
            long resMem = fb.fibonacciWithDP(n, 0);
            long resTab = fb.fibonacciWithDP(n, 1);
            long resTab2 = fb.fibTabSpaceOptimised(n);
            bw.write(""+String.valueOf(resTab)+"\n");
            bw.flush();
            bw.write(""+String.valueOf(resMem)+"\n");
            bw.flush();
            bw.write(""+String.valueOf(resTab2)+"\n");
            bw.flush();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Error in handling output");
        }
        
        // long res2 = fb.fibonacci(n);
        // try {
        //     bw.write(""+String.valueOf(res2));
        //     bw.flush();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.err.println("Error in handling output");
        // }
    }
}
