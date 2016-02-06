package backtracking;/* Created by vermak5 on 11/30/2015 */

public class NQueensProblemDemo {

    public static void main(String[] args) {

        int n = 5;
        solveNQ(n);
    }

    private static void solveNQ(int n) {

        boolean[][] board = new boolean[n][n];

        if (!solveNQUtil(board, 0)) {
            System.out.println("Configuration not solvable");
        }
        else {
            printBoard(n, board);
        }
    }

    private static void printBoard(int n, boolean[][] board) {
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
           System.out.println();
        }
    }

    private static boolean solveNQUtil(boolean[][] board, int col) {
        int n = board.length;

        if (col >= n) return true; // all queens placed

        for (int row=0; row<n; row++) {

            if (isSafe(board, row, col)) {

                board[row][col] = true;        // put the queen here

                if (solveNQUtil(board, col + 1)) {
                    return true;
                }

                board[row][col] = false;        // remove the queen, Backtrack
            }
        }

        return false;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int N = board.length;
        int i, j;

       /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i])
                return false;

        /* Check upper diagonal on left side */
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j])
                return false;

        /* Check lower diagonal on left side */
        for (i=row, j=col; j>=0 && i<N; i++, j--)
            if (board[i][j])
                return false;

        return true;
    }

}
