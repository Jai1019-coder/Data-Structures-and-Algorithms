import java.util.ArrayList;
import java.util.Arrays;

public class PairSum1 {
    /*Brute force approach*/
    public static boolean findPairSum(ArrayList<Integer> list, int target){
        for(int i : list){
            for(int j = 1; j < list.size(); j++){
                if(i+list.get(j) == target) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(findPairSum(list,5));
    }
}
