package dp;/* Authored by Kushagra on 12/19/2015. */

public class LCSDemo {
    public static void main(String[] args) {

        String S = "ABCDGH";
        String T = "AEDFHR";
        int m = S.length();
        int n = T.length();
        System.out.println(LCS(S, m, T, n));
    }

    private static int LCS(String S, int m, String T, int n) {

        int[][] L = new int[m+1][n+1];
        int i, j;

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {

                // init
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                    continue;
                }

                // similar char found
                if (S.charAt(i) == T.charAt(j)) {
                    L[i][j] = 1 + L[i - 1][j - 1];
                }

                // recurse down
                else {
                    L[i][j] = Math.max(L[m - 1][n], L[m][n - 1]);
                }
            }
        }

        return L[m-1][n-1];
    }

    private static int LCS_R(String S, int m, String T, int n) {

        if (m == 0) return 0;
        if (n == 0) return 0;

        if (S.charAt(m - 1) == T.charAt(n - 1)) {
            return 1 + LCS(S, m - 1, T, n - 1);
        } else {
            return
                    Math.max(
                            LCS(S, m, T, n - 1),
                            LCS(S, m - 1, T, n));
        }
    }

}
