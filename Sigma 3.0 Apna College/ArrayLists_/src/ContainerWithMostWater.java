import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
    public static int containerWithMaxWater(ArrayList<Integer> list){
        int finalWaterArea = (list.size()-1)*Math.min(list.get(0),list.get(list.size()-1));
        for (int i = 0; i < list.size()-2; i++) {
            for (int j = list.size()-1; j > i; j--) {
                int waterArea = (j-i)*Math.min(list.get(i),list.get(j));
                if (finalWaterArea < waterArea){
                    finalWaterArea = waterArea;
                }
            }
        }
        return finalWaterArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.print(containerWithMaxWater(arr));
    }
}
