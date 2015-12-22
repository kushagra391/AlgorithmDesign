package recursion;/* Authored by Kushagra on 12/12/2015. */

public class PrintArrayDemo {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};

        printArray(A);

    }

    private static void printArray(int[] A) {
        int n = A.length;
        printArrayUtil(A, n - 1);
    }

    private static void printArrayUtil(int[] A, int n) {

        if (n < 0) return;

        System.out.print(A[n] + " ");
        printArrayUtil(A, n-1);
    }


}
