package Arrays;

public class RotatedSorted {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 2;
        int location = search(arr, 2, 0, arr.length-1);
        System.out.print(location);
    }
    static int search(int[] arr, int key, int start ,int end){
        if (end < start) return -1;
        int mid = start+(end-start)/2;
        if (arr[mid] == key) {
            return mid;
        }
        else if (arr[start]<=arr[mid]) {
            if (key >= arr[start] && key <= arr[mid])
                return search(arr, key, start,mid-1);
            else return search(arr, key, mid+1, end);
        }
        else if (key >= arr[mid] && key<= arr[end])
            return search(arr, key, mid+1, end);
        else return search(arr, key, start,mid-1);
    }
}
