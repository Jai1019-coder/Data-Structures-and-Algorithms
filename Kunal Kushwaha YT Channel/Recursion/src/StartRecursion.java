public class StartRecursion {
    public static void main(String[] args) {
        System.out.println("Printing Numbers");
        printn(1);
    }
    static void printn(int n){
        if (n == 5){
            System.out.print(5);
            return;
        }
        System.out.println(n);
        printn(n+1);
        System.out.println(n);
    }
}
