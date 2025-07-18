package dynamicProgramming.BufferedReader;

import java.io.*;

public class BRRead {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String c = " ";
        while (!c.equals("q")) {
            try{
                c = (String)br.readLine();
            }catch(IOException e) {
                System.err.println("Error in processiing input");
            }
            try {
                bw.write(c);
                bw.flush();
            } catch (Exception e) {
                System.err.println(("Error in processing output"));
            }
        }
    }
}
