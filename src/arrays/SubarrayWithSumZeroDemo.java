package arrays;/* Authored by Kushagra on 12/19/2015. */

import java.util.HashMap;

public class SubarrayWithSumZeroDemo {

    public static void main(String[] args) {

        int[] A = {2, 3, 6, -5, -1};
        System.out.println(printZeroSumSubArray(A));
        System.out.println(printSumKSubArray(A, 9));
    }

    private static boolean printSumKSubArray(int[] A, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i=0; i<A.length; i++) {

            int x = A[i];
            sum += x;

            if (x==0 || sum == 0 || map.containsKey(sum - k)) {
                return true;
            }

            map.put(sum, i);
        }

        return false;
    }

    private static boolean printZeroSumSubArray(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i=0; i<A.length; i++) {

            int x = A[i];
            sum += x;

            if (x==0 || sum == 0 || map.containsKey(sum)) {
                return true;
            }

            map.put(sum, i);
        }

        return false;
    }

}
