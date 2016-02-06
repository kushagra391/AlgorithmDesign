package backtracking;/* Created by vermak5 on 11/30/2015 */

public class RatInAMazeDemo {

    public static void main(String[] args) {

        boolean[][] maze = TestMaze();

        solveMaze(maze);
    }

    private static boolean[][] TestMaze() {
        return new boolean[0][];
    }

    private static void solveMaze(boolean[][] maze) {
        int n = maze.length;
        boolean[][] sol = new boolean[n][n];

        if (!solveMazeUtil(maze, 0, 0, sol))
            System.out.println("Configuration not solvable");
        else
            print2DArray(n, maze);
    }

    private static boolean solveMazeUtil(boolean[][] maze, int row, int col, boolean[][] sol) {
        int n = maze.length;
        if (row >= n && col >= n) {
            return true;
        }




        return false;
    }

    private static void print2DArray(int n, boolean[][] board) {
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
