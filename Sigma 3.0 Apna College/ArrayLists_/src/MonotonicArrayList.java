import java.util.ArrayList;
import java.util.Arrays;
public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean isInc = true, isDec = true;
        for (int i = 1; i <= list.size()-1; i++) {
//          For monotonic increasing
            if(list.get(i)>list.get(i-1)){
                isDec = false;
            }
//            For monotonic decreasing
            if(list.get(i)<list.get(i-1)){
                isInc = false;
            }
        }
        return isInc||isDec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,2));
        System.out.print(isMonotonic(nums));
    }
}
