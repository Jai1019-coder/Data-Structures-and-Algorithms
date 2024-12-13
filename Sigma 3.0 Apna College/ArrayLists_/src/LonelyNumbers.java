import java.util.ArrayList;
import java.util.Arrays;

public class LonelyNumbers {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int xOccurence = 0, justBelowX = 0, justAboveX = 0;
            for (int j = 0; j < n; j++) {
                if(nums.get(i) == nums.get(j)){
                    xOccurence++;
                }
                if(nums.get(j) == nums.get(i)-1){
                    justBelowX = 1;
                }
                if(nums.get(j) == nums.get(i)+1){
                    justAboveX = 1;
                }
            }
            if(xOccurence == 1 && justBelowX == 0 && justAboveX == 0)
                list.add(nums.get(i));
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,3));
        System.out.print(findLonely(list));
    }
}
