package arrays;/* Authored by Kushagra on 12/14/2015. */

public class TwoRepeatingNumbersDemo {
    public static void main(String[] args) {

        System.out.println((1 ^ 2));
        System.out.println((1 ^ 2 ^ 1));
        System.out.println((1 ^ 2 ^ 3));
        System.out.println((1 ^ 1));


        int[] A = {1, 3, 5, 1, 3, 7};
        printRepeatingNumbers(A);

    }

    private static void printRepeatingNumbers(int[] A) {
        int n = A.length;
        if (n <= 1) return;

        int result = A[0];

        for (int i=1; i<n; i++) {
            int item = A[i];
            if ((result ^ item) == 0) {
                System.out.println(item);
            }
            else {
                result = result ^ item;
            }
        }


    }
}
