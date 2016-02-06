package arrays;/* Authored by Kushagra on 2/6/2016. */

import java.util.Arrays;

public class TwoSumSortedDemo {

    public static void main(String[] args) {

        int[] A = {1, -2, 4, 6, -11, 21, 14, 28, 41, -15};
        int k = 10;
        System.out.println(TwoSumSorted(A, k));

    }

    public static boolean TwoSumSorted(int[] A, int k) {

        // corner cases
        if (A == null) return false;
        if (A.length < 2) return false;

        // sort the array
        Arrays.sort(A);

        int leftIndex = 0;
        int rightIndex = A.length - 1;

        boolean flag = false;
        while (leftIndex < rightIndex) {

            int leftElement = A[leftIndex];
            int rightElement = A[rightIndex];

            int sum = leftElement + rightElement;

            // pair found
            if (sum == k) {
                flag = true;
                System.out.println(leftElement + ", " + rightElement);
                leftIndex++; // advance one of the two pointers to find more such results
            }

            // shift right pointer to left
            if (sum > k) {
                rightIndex--;
            }

            // shift left pointer to right
            if (sum < k) {
                leftIndex++;
            }
        }

        System.out.println(Arrays.toString(A));
        return flag;
    }


}
