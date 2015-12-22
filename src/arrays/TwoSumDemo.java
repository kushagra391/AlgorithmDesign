package arrays;/* Authored by Kushagra on 12/14/2015. */

import java.util.HashSet;

public class TwoSumDemo {

    public static void main(String[] args) {

        int[] A = {0, 0, 6, 9, 1};
        int k = 0;

        System.out.println(twoSum(A, k));
    }

    private static boolean twoSum(int[] A, int k) {

        HashSet<Integer> set = new HashSet<>();
        for (int item : A) {
            set.add(k - item);
        }

        for (int item : A) {

            if (item == k / 2 && k%2 == 0) {
                int count = getCount(A, item);
                if (count == 1) {
                    continue;
                }
            }

            if (item == 0 && k == 0) {
                int count = getCount(A, 0);
                if (count == 1) {
                    continue;
                }
            }

            if (set.contains(item)) {
                return true;
            }
        }

        return false;
    }

    private static int getCount(int[] a, int item) {
        int count  = 0;
        for (int x : a) {
            if (x == item)
                count++;
        }

        return count;
    }

}
