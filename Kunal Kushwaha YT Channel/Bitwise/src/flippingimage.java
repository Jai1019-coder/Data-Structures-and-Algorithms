public class flippingimage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    }
    void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int i = 0;
        while(i<image.length-1){
            for (int j = 0; j<image[i].length/2;j++){
                swap(image[i][j], image[i][image[i].length-1-j]);
                image[i][j] = image[i][image[i].length-1-j];
            }
            i++;
        }
        return image;
    }
}
