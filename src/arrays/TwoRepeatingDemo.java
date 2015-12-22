package arrays;/* Authored by Kushagra on 12/20/2015. */

public class TwoRepeatingDemo {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 2};
        printRepeating(A);

    }

    private static void printRepeating(int[] A) {

        int result = A[0];

        for (int i = 1; i < A.length; i++) {
            int x = A[i];
            if (x == 0) continue;

            if ((result ^ x) == 0) {
                System.out.println(x);
            } else {
                result = result ^ x;
            }
        }
    }

}
