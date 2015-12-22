package matrix;/* Authored by Kushagra on 12/13/2015. */

public class SearchSortedMatrixDemo {

    public static void main(String[] args) {

        int[][] mat = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        System.out.println(search(mat, 29));
        System.out.println(search(mat, 31));
    }

    private static boolean search(int[][] M, int key) {
        int n = M.length;
        int m = M[0].length;

        boolean result = false;
        for (int row = 0; row < n; row++) {

            int first = M[row][0];
            int last = M[row][m-1];

            if (key >= first && key <=last) {
                result = result || find(M, row, key);
            }
        }

        return result;
    }

    private static boolean find(int[][] M, int row, int key) {
        int m = M[0].length;

        for (int i=0; i<m; i++) {
            if (M[row][i] == key) {
                return true;
            }
        }

        return false;
    }
}
