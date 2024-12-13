package Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {5,4,5,2,1};
        if (isSorted(arr, 1)) System.out.print("Yes");
        else System.out.print("No");
    }
    static boolean isSorted(int[] arr, int i){
        if (i == arr.length-1) return true;
        else if ((arr[i]<=arr[i+1]&&arr[i]>=arr[i-1])||(arr[i]>=arr[i+1]&&arr[i]<=arr[i-1])) return isSorted(arr, i+1);
        else return false;
    }
}
