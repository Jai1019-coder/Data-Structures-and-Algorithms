package maximumareainhistogram;
import java.util.Arrays;
public class BruteForceSolution {
    public static int largestRactangleArea(int[] arr){
        Arrays.sort(arr);
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                count++;
            }
            int area = arr[i]*count;
            if (maxArea<area) {
                maxArea = area;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRactangleArea(arr));
    }
}
