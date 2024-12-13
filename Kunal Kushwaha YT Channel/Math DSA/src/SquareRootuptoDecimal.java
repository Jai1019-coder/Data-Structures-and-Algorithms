public class SquareRootuptoDecimal {
    public static void main(String[] args) {
//        int n = 40;
//        int p =3;
//        System.out.printf("%.3f",sqrt(40,3));
        double n1 = 6;
        double n2 = 0.1;
        double ans = n1+n2+n2+n2;
        if (ans<6.3) System.out.println(true);
    }
    static double sqrt(int n, int p){
        int s = 0, e = n;
        double root = 0.0;
        while(s<e){
            int m = s+(e-s)/2;
            if (m*m == n) return m;
            else if (m*m > n){
                e = m-1;
                root = e;
            }
            else s = m+1;
        }
        double precision = 0.1;
        for (int i = 1; i <= p ; i++) {
            while (root*root<=n){
                root+=precision;
            }
            root -= precision;
            precision/=10;
        }
        return root;
    }
}
