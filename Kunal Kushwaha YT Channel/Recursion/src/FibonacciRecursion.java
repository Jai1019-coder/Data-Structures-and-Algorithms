public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 50;
        System.out.print("Fibonacci term 0f "+n+" is "+fibo(n));
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
