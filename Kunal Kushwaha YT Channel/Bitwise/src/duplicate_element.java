public class duplicate_element {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 4, 5, 2, 6, 5, 3};
        int unq = 0;
        for (int n :
                A) {
            unq ^= n;
        }
        System.out.println(unq);
    }
}
