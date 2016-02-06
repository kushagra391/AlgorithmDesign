package arrays;/* Authored by Kushagra on 2/6/2016. */

import java.util.Arrays;

public class ThreeSumClosestDemo {

    public static void main(String[] args) {

        int[] A = {2, 1, 4};
        System.out.println(Arrays.toString(A));
        changeArray(A);
        System.out.println(Arrays.toString(A));

        System.out.println(threeClosestSum(A));
    }

    private static void changeArray(int[] A) {

        int[] R = {21, 211, 2333};

        A = R;
    }

    private static int threeClosestSum(int[] A) {
        return 0;
    }
}
