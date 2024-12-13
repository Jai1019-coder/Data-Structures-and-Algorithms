package Level1;

public class NtoOne {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 1){
            System.out.println(n);
            return;
        };
        System.out.println(n);
        fun(n-1);
        return;
    }
}
