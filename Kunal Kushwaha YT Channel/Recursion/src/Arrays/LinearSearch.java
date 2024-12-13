package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        System.out.print(linearSearch(arr, 18,0));
    }
    static int linearSearch(int[] arr, int target, int i){
        if (arr[i] == target) return i;
        else if (arr[i]!= target && i == arr.length-1) {
            return -1;
        }
        else return linearSearch(arr, target, i+1);
    }
}
