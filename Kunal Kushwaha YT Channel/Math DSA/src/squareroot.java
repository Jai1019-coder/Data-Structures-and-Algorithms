public class squareroot {
    public static void main(String[] args) {
        int n = 40;
        int s = 0, e = n;
        while(s<=e){
            float mid = s+(float)(e-s)/2;
            if ((float)(mid*mid) == n) {
                System.out.print(mid);
                break;
            }
            else if (mid*mid > n) {
                e = (int)mid-1;
            }
            else s = (int)mid+1;
        }
    }
}
