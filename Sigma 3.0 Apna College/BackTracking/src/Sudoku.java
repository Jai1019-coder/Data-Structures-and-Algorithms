//public class Sudoku {
//    public static void main(String[] args) {
//       int[][] sudoku ={{5, 3, 0, 0, 7, 0, 0, 0, 0},
//                        {6, 0, 0, 1, 9, 5, 0, 0, 0},
//                        {0, 9, 8, 0, 0, 0, 0, 6, 0},
//                        {8, 0, 0, 0, 6, 0, 0, 0, 3},
//                        {4, 0, 0, 8, 0, 3, 0, 0, 1},
//                        {7, 0, 0, 0, 2, 0, 0, 0, 6},
//                        {0, 6, 0, 0, 0, 0, 2, 8, 0},
//                        {0, 0, 0, 4, 1, 9, 0, 0, 5},
//                        {0, 0, 0, 0, 8, 0, 0, 7, 9}};
//       sudokuSolver(sudoku);
//    }
//    public static void sudokuSolver(int[][] sudoku, int row, int col){
//        int nextRow = row;
//        int nextCol = col;
//        if(col == 9){
//            nextRow++;
//            nextCol = 0;
//        }
//        for(int j = 0; j < 9; j++){
//            if(isValid(sudoku, row, j)){
//                sudoku[row][col] = j;
//                sudokuSolver(sudoku,nextRow,nextCol);
//            }
//        }
//    }
//}
