public class SieveofEratosthenes {
    public static void main(String[] args) {
        int n = 36; int i = 2;
        boolean[] arr = new boolean[n+1];
        while(i*i <= n){
            if(!arr[i]){
                for (int j = i*2; j <= n; j=j+i) {
                    arr[j] = true;
                }
            }
            i++;
        }
        for (int j = 2; j <= n; j++) {
            if (!arr[j]) System.out.print(j+" ");
        }
    }
}
