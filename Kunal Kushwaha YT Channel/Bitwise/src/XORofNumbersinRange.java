public class XORofNumbersinRange {
    public static void main(String[] args) {
        int a = 10;
        int b = 18, c = b-a, d = b%4;
        int xor = 0;
        if (c > d){
            if((b&1)!=1) xor = (b-d)^(b-d+1)^(b-d+2);
            else xor = (b-d)^(b-d+1)^(b-d+2)^c;
        }
        else {
                for (int i = 0; i<d;i++){
                    xor = xor^(a+i);
            }
        }
        System.out.print(xor);
    }
}
