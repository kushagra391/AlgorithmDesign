package matrix;/* Authored by Kushagra on 12/13/2015. */

public class PrintSpiralMatrixDemo {

    private static String space = " ";

    public static void main(String[] args) {

        int[][] M = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        printSpiral(M);
    }

    private static void printSpiral(int[][] M) {

        int n = M.length;
        int m = M[0].length;

        for (int cycle = 0; cycle < m / 2; cycle++) {

            printHorizontalForward(M, cycle);
            printVerticalForward(M, cycle);
            printHorizontalBackward(M, cycle);
            printVerticalBackward(M, cycle);
        }
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private static void printVerticalBackward(int[][] M, int cycle) {

        int m = M[0].length;
        int n = M.length;

        int colIndex = cycle;
        int startRow = m - 1 - cycle;
        int endRow = cycle;
        for (int row = startRow; row >= endRow; row--) {
            System.out.print(M[row][colIndex] + space);
        }
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private static void printHorizontalBackward(int[][] M, int cycle) {

        int m = M[0].length;
        int n = M.length;

        int rowIndex = (n - 1) - cycle;
        int startCol = m - 1 - cycle;
        int endCol = cycle;

        for (int col=startCol; col >= endCol; col--) {
            System.out.print(M[rowIndex][col] + space);
        }
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private static void printVerticalForward(int[][] M, int cycle) {
        int m = M[0].length;
        int n = M.length;

        int colIndex = (m - 1) - cycle;
        int startRow = cycle;
        int endRow = (n - 1) - cycle;
        for (int row = startRow; row >= endRow; row--) {
            System.out.print(M[row][colIndex] + space);
        }
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private static void printHorizontalForward(int[][] M, int cycle) {
        int m = M[0].length;

        int rowIndex = cycle;
        int startCol = cycle;
        int endCol = (m - 1) - cycle;
        for (int col = startCol; col <= endCol; col++) {
            System.out.print(M[rowIndex][col] + space);
        }
    }


}
