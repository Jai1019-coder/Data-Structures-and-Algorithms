public class countsetbit {
    public static void main(String[] args) {
        int a = 9;
        int count = 0;
        while (a > 0){
            if((a&1)==1)
                count++;
            a>>=1;
        }
        System.out.print(count);
    }
}
