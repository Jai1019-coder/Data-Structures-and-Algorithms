package MoveZeroesToEnd;

class Solution {
    // Brute Force Approach
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for(int k = 0; k < n; k++){
                if (nums[i] == 0) {
                    int temp = nums[i];
                    for(int j = i+1; j < n; j++){
                        nums[j-1] = nums[j];
                    }
                    nums[n-1] = temp;
                    
                }
            }
        }
    }
    public static void printArray(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {0, -6691, 47518, 51784, 23455, 90185, 0, 25778, -10144, 
                    18642, -82456, 52576, -66129, 34535, 99251, 71742, -19617, 66198, 
                    -55400, 30887, -86658, -56547, 62800, 0, 66306, 79976, 43557, -1339, 
                    -60070, 17131, -64435, 0, -51579, 19856, -30816, 73181, 63529, 29378, 
                    -38149, -19373, 54211, -59335, 78642, -42091, -60378, -92402, 0, -77884, 
                    8930, 2073, 93650, -82745, 62532, 0, -93119, -82227, -74919, -86076, 11537, 
                    -6287, -89031, 16904, 21327, -71735};
        moveZeroes(arr);
        printArray(arr);
    }
}
