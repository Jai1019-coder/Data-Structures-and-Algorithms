package Pattern_Questions;

public class StarTriangleUlta {
    public static void main(String[] args) {
        starTriangleUlta(4,0);
    }
    static void starTriangleUlta(int r ,int c){
        if (r != 1 || c != 1) {
            if (c < r) {
                System.out.print("*");
                starTriangleUlta(r, c + 1);
            } else {
                System.out.println();
                starTriangleUlta(r - 1, 0);
            }
        }
    }
}
