public class PrimeFactor {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n%i == 0) {
                System.out.println(i+" "+n/(i+1-Math.sqrt(n)));
            }
        }
//        for (int i = 1; i < Math.sqrt(n) ; i++) {
//
//        }
    }
}
