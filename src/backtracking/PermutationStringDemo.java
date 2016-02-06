package backtracking;

import java.util.Arrays;

public class PermutationStringDemo {

    public static void main(String[] args) {
        String S = "ABC";
        solution(S);
    }

    private static void solution(String S) {

        int l = 0;
        int r = S.length() - 1;

        char[] s = S.toCharArray();
        permute(s, l, r);
    }

    private static void permute(char[] S, int left, int right) {

        int i;
        if (left == right)
            System.out.println(Arrays.toString(S));
        else {
            for (i=left; i<= right; i++) {
                swap(S, left, i);
                permute(S, left+1, right);
                swap(S, left, i);  // backtrack
            }
        }
    }

    private static void swap(char[] S, int x, int y) {
        char temp = S[x];
        S[x] = S[y];
        S[y] = temp;
    }
}
