package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ClimbingStairsStarter {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;
        try {
            bw.write("Enter the no. of stairs : ");
            bw.flush();
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println("Error in reading input");
        }
        ClimbingStairs s = new ClimbingStairs();
        try {
            long res0 = s.dp(n, 0);
            bw.write(""+String.valueOf(res0)+"\n");
            bw.flush();
            long res1 = s.dp(n, 1);
            bw.write(""+String.valueOf(res1)+"\n");
            bw.flush();
            long res2 = s.dp(n, 2);
            bw.write(""+String.valueOf(res2)+"\n");
            bw.flush();
            long resBf = s.burteForce(n);
            bw.write(""+String.valueOf(resBf)+"\n");
            bw.flush();
            long resErr = s.dp(n, 4);
            bw.write(""+String.valueOf(resErr));
            bw.flush();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
