import java.util.ArrayList;
import java.util.Arrays;

public class PairSum12Ptr {
    public static boolean findPairSum(ArrayList<Integer> list, int target){
        int i = 0, j = list.size()-1;
        while(i<j){
            if(list.get(i)+list.get(j) == target) return true;
            else if (list.get(j)>target || (list.get(i)+list.get(j))>target) {
                j--;
            }
            else i++;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.print(findPairSum(list,5));
    }
}
