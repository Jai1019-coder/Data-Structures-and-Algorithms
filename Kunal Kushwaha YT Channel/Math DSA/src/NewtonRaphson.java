public class NewtonRaphson {
    public static void main(String[] args) {
        int n = 40; double x = n;
        double root = 0;
        while(true){
            root = 0.5*(x+(n/x));
            if (Math.abs(x-root)<0.000000000000000000001) break;//Condition for desired accuracy
            x = root;
        }
        System.out.print(root);
    }
}
