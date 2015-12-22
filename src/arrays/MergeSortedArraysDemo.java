package arrays;/* Authored by Kushagra on 12/13/2015. */

import java.util.Arrays;

public class MergeSortedArraysDemo {

    public static void main(String[] args) {

        int[] A = {2, 4, 7, 9};
        int[] B = {1, 4, 6, 9, 13, 21};

        int[] C = mergeSortedArrays(A, B);

        System.out.print(Arrays.toString(C));

    }

    private static int[] mergeSortedArrays(int[] A, int[] B) {

        int n = A.length;
        int m = B.length;

        int[] C = new int[m + n];

        int x = 0;
        int y = 0;
        int i = 0;
        while (x < n && y < m) {

            if (A[x] < B[y]) {
                C[i] = A[x];
                x++;
            } else {
                C[i] = B[y];
                y++;
            }

            i++;
        }

        while (x < n) {
            C[i++] = A[x];
            x++;
        }

        while (y < m) {
            C[i++] = B[y];
            y++;
        }

        return C;
    }


}
