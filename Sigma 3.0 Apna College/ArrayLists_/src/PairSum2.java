import java.util.ArrayList;
import java.util.Arrays;

public class PairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int i = 0, j = list.size()-1;
        while(i<j){
            if(list.get(i)+list.get(j) == target) {
                System.out.println(list.get(i)+" "+ list.get(j));
                return true;
            }
            else if (list.get(j)>target) j--;
            else if (list.get(i)>target) i++;
            else if((list.get(i)+list.get(j))>target){
                if(list.get(i)>list.get(j)) i++;
                else j--;
            }
            else if((list.get(i)+list.get(j))<target){
                if(list.get(i)>list.get(j)) i++;
                else j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,15,6,8,9,10));
        System.out.print(pairSum(list,16));
    }
}
