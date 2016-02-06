package arrays;/* Authored by Kushagra on 2/6/2016. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumDemo {

    public static void main(String[] args) {

        int[] A = {1, -2, 4, 6, -11, 21, 14, 28, 41, -15};

        List<List<Integer>> results = ThreeSum(A);
        for (List<Integer> result : results) {
            System.out.println(result.toString());
        }
    }

    // find unique triplets
    private static List<List<Integer>> ThreeSum(int[] A) {

        List<List<Integer>> results = new ArrayList<>();

        // corner cases
        if (A == null) return results;
        if (A.length < 3) return results;

        Arrays.sort(A);
        for (int i=0; i<A.length; i++) {

            int x = A[i];
            int k = - x;
            int startIndex = i + 1; // key step to remove duplicates

            return TwoSum(A, startIndex, k);
        }

        return null;
    }

    @SuppressWarnings("Duplicates")
    private static List<List<Integer>> TwoSum(int[] A, int startIndex, int k) {

        // corner cases
        if (A == null) return null;
        if (A.length < 2) return null;

        List<List<Integer>> results = new ArrayList<>();

        // sort the array
        Arrays.sort(A);

        int leftIndex = startIndex;
        int rightIndex = A.length - 1;

        while (leftIndex < rightIndex) {

            int leftElement = A[leftIndex];
            int rightElement = A[rightIndex];

            int sum = leftElement + rightElement;

            // pair found
            if (sum == k) {
                if (leftElement != -k && rightElement != -k) {
                    System.out.println(leftElement + ", " + rightElement + " : " + k) ;
                    int[] R = {leftElement, rightElement, k};
                    ArrayList result = new ArrayList<>(Arrays.asList(R));
                    results.add(result);
                }
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

        return results;
    }

}
