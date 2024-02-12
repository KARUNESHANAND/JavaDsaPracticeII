import java.util.*;

public class NqueensifQueensAttackDoesntMatter {
    public static void NQueens(char[][] board , int row,int n) {
        if (row == board.length) {
            PrintMatrixofN(board,n );
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            NQueens(board,row+1,n);//function call
            board[row][j]='.';//backtracking call


        }
    }
    public static void PrintMatrixofN(char[][] board, int n){
        System.out.println("------CHESS BOARD------");
        for(int i=0; i<n; i++){
            for(int j=0; j<n ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Chess for NXN : ");
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n ; j++){
                // System.out.println("Enter the element of the"+i+"th row and "+j+"th column.");
                // board[i][j] = sc.nextInt();
                //intializing the chess board with "."
                board[i][j] = '.';
            }
        }
        PrintMatrixofN(board,n);
        NQueens(board , 0, n);
    }    
}
