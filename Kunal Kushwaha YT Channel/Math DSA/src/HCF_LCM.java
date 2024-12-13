public class HCF_LCM {
    public static void main(String[] args) {
        int a = 45, b = 78;
        int hcf = hcf(a,b);
        int lcm = (a*b)/hcf;
        System.out.println("HCF"+"("+a+","+b+") = "+hcf);
        System.out.println("LCM"+"("+a+","+b+") = "+lcm);
    }
    static int hcf(int a , int b){
        if(a == 0) return b;
        return hcf(b%a,a);
    }
}
