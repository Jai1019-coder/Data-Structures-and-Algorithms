package Arrays;
import java.util.ArrayList;
public class LinearSearchMultipleOccurrences {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5};
        ArrayList<Integer> occurs = new ArrayList<>();
        System.out.print(occurrences(arr, 4,0,occurs));
    }
    static ArrayList occurrences(int[] arr, int target, int i, ArrayList<Integer> list){
        if (arr[i] == target) list.add(i);
        else if (i == arr.length-1) return list;
        return occurrences(arr, target, i+1, list);
    }
}
