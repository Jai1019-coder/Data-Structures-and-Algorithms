public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 66;
        int s = 0, e = arr.length - 1;
        System.out.print(binarysearch(arr, target, s ,e));
    }
    static int binarysearch(int[] arr, int target, int s, int e) {
        if (e<s) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] < target) {
            return binarysearch(arr, target, mid + 1, e);
        } else if (arr[mid] > target) {
            return binarysearch(arr, target, s, mid - 1);
        }
        else return mid;
    }
}


