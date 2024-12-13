package Pattern_Questions;

public class StarTriangle {
    public static void main(String[] args) {
        starTriangle(4,0);
    }
    static void starTriangle(int r , int c){
        if (r==0) return;
        if (c<r){
            starTriangle(r, c+1);
            System.out.print("*");
        }
        else {
            starTriangle(r-1, 0);
            System.out.println();
        }
    }
}

