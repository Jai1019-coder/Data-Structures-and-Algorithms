import java.util.ArrayList;
import java.util.Arrays;
public class Swapping {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int t = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, t);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,23,4,589,89,82));
        System.out.println(list);
        swap(list,1,3);
        System.out.print(list);
    }
}
