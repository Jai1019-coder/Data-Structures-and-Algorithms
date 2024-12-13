public class GridWaysLinearTime {
    public static void main(String[] args) {
        int m;
        int n = m = 8;
        System.out.print(gridWaysLinearTime(n,m));
    }
    public static int gridWaysLinearTime(int n, int m){
        return (fact(n-1+m-1))/(((fact(n-1))*(fact(m-1))));
    }
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
}
