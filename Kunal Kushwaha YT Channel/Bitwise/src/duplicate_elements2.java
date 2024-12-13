import java.util.*;
public class duplicate_elements2 {
    static final int INT_SIZE = 4;
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,2,7,8,8,8};
        int[] sum_ = new int[4];
        for(int n : arr){
            int sum = 0;
            for (int i = 0; i < INT_SIZE; i++) {
                if (((n >> i)&1) != 0) sum++;
                sum_[i] = sum;
            }
        }
        System.out.println(Arrays.toString(sum_));
//        String result = "";
//        for (int i = 0; i < sum_.length; i++) {
//            result = result + (sum_[i] % 3);
//        }
//        System.out.println(result);
    }
}
