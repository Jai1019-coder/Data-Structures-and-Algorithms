/*Explanation is in notebook.*/
/*Divide and conquer approach. */
/*Time Complexity is O(logn)*/
class akipowerb{
    public static void main(String[] args) {
        int a = 2;
        int b = 17, ans = 1;
        while(b>0){
            if((b&1) == 1)
                ans = ans*a;
            a = a*a;
            b = b>>1;
        }
        System.out.println(ans);
    }
}
