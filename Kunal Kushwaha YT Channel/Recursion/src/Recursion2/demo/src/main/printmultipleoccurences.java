public class printmultipleoccurences {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        multipleoccurences(arr, 2, 0);
    }
    public static void multipleoccurences(int[] arr, int key, int i){
        if(i == arr.length) return;
        else if(arr[i] == key) System.out.print(i+" ");
        multipleoccurences(arr, key, ++i);
    }
}
