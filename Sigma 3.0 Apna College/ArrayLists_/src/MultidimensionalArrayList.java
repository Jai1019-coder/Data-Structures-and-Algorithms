import java.util.ArrayList;
import java.util.Arrays;

public class MultidimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        mainList.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15, 18, 21));
        mainList.add(list3);
        for (int i = 0; i < mainList.size(); i++) {
            System.out.print("List"+(i+1)+" ");
            System.out.println(mainList.get(i));
        }
        System.out.print(mainList);
    }
}
