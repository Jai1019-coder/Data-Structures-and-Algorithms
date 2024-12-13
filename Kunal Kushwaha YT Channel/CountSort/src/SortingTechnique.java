import java.util.Arrays;

public class SortingTechnique {
    static int[] countSort(int[] nums){
        int[] count;
        count = new int[1000];
        int[] result = new int[nums.length];
        for(int num : nums) count[num]++;
        for(int i = 1; i < count.length; i++){
            count[i]+=count[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) result[i] = 0;
            else result[i] = count[nums[i]-1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4,1,6,4,3};
        int[] ans = countSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
