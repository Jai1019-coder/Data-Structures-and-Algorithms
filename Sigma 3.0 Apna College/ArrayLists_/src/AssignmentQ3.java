import java.util.ArrayList;
import java.util.Arrays;
public class AssignmentQ3 {
    public static int mostFrequentKeyTarget(ArrayList<Integer> list, int key){
        int[] result = new int[1000];
        for (int i = 0; i <= list.size()-2; i++) {
            if(list.get(i) == key){
                result[list.get(i+1)]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int target = 0;
        for(int i = 0; i < 1000; i++){
            if(max < result[i]){
                max = result[i];
                target = i;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,1));
        System.out.print(mostFrequentKeyTarget(nums,2));
    }
}
