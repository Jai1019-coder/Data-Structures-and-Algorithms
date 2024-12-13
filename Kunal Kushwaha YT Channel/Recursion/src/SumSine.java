import java.util.*;
public class SumSine {
    public static void main(String[] args) {
        System.out.println(sumSine(0.5, 5, 1));
    }
    static double sumSine(double x, int n, double t){
        if (n == 1) return x;
        t = ((Math.pow(-1,n+1)*Math.pow(x,2*n-1))/fact(2*n-1));
        return t+sumSine(x, --n, t);
    }

    private static int fact(int i) {
        if (i <= 1) return 1;
        return i*fact(i-1);
    }
}
