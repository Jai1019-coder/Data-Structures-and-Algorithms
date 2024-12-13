import java.util.Scanner;
public class N_QueensCheck {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N - size of board and no of queens : ");
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '×';//Alt+0215
            }
        }
        nQueens(board, 0);
        if (count != 0) System.out.print("Soulution Possible");
        else System.out.print("Solution not possible");
    }
    public static boolean isSafe(char[][]board,int row, int col){
        //vertically up
        for (int i = row; i >= 0 ; i--) {
            if (board[i][col] == 'Q') return false;
        }
        //diag left
        for (int i = row, j = col; i >= 0 && j >= 0 ; i--,j--) {
            if (board[i][j] == 'Q') return false;
        }
        //diag right
        for (int i = row, j = col; i >= 0 && j < board.length ; i--,j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }
    public static boolean nQueens(char[][] board, int row){
        if (row == board.length){
            printBoard(board);
            count++;
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)) return true;
                board[row][j] = '×';//Alt+0215//backtracking step
            }
        }
        return false;
    }
    public static void printBoard(char[][] board){
        System.out.println("-----------------CHESS--Borad-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("  "+board[i][j]);
            }
            System.out.println();
        }
    }
}
