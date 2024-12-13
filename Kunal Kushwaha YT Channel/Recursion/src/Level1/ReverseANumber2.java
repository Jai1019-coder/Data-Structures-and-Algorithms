package Level1;
public class ReverseANumber2 {
    static int sum = 0;

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n, (int)Math.log(n)+1));
    }
    static int reverse(int n, int digits){
        if (n==0) return 0;
        return (int) ((n%10)*Math.pow(10, digits-1)+reverse(n/10, digits-1));
    }
}
