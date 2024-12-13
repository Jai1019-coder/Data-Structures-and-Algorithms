import java.util.ArrayList;
import java.util.Arrays;
public class ContainerWithMostWater2Ptr {
    public static int containerWithMostWater(ArrayList<Integer> list){
        int n = list.size(), lp = 0, rp = n-1, ht = Math.min(list.get(lp), list.get(rp));
        int mostWater = (n-1)*ht;
        while(lp<rp){
            int currWater = (rp-lp)*Math.min(list.get(lp), list.get(rp));
            mostWater = Math.max(mostWater, currWater);
            if(list.get(lp)<list.get(rp)){
                lp++;

            }
            else rp--;
        }
        return mostWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.print(containerWithMostWater(height));
    }
}
