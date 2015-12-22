package arrays;/* Authored by Kushagra on 12/14/2015. */

import java.util.Arrays;

public class ReverseArrayDemo {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        System.out.println(Arrays.toString(A));
        reverse(A);
        System.out.println(Arrays.toString(A));

    }

    private static void reverse(int[] A) {

        reverseArray(A, 0, A.length - 1);


    }

    private static void reverseArray(int[] A, int left, int right) {

        if (left >= right) {
            return;
        }

        int temp = A[left];
        A[left] = A[right];
        A[right] = temp;

        reverseArray(A, left + 1, right - 1);
    }

}
