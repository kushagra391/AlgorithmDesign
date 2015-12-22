package heaps;/* Authored by Kushagra on 12/13/2015. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKSortedArraysDemo {

    public static void main(String[] args) {

        int[][] A = {{11, 14, 21, 30},
                {7, 20, 27, 35},
                {3, 8, 11, 19, 41}};

        int[] S = mergeSortedArrays(A);
        System.out.println(Arrays.toString(S));
    }

    private static int[] mergeSortedArrays(int[][] A) {

        int k = A.length;
        int n = A[0].length;

        ArrayList<Integer> S = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0; i<k; i++) {
            minHeap.add(A[i][0]);
        }


        for (int i=0; i<k; i++) {
            for (int j=1; j<n; j++) {
                minHeap.add(A[i][j]);
                S.add(minHeap.remove());
            }
        }

        int[] R = new int[S.size()];
        int index = 0;
        for (int x : S)
            R[index++] = x;

        return R;
    }


}
