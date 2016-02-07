package arrays;/* Authored by Kushagra on 2/7/2016. */

public class FindPivotDemo {
    public static void main(String[] args) {

        int[] A = {5, 6, 1, 2, 3, 4};

        System.out.println(findPivot(A));

    }

    private static int findPivot(int[] A) {

        int left = 0;
        int right = A.length - 1;

        while (left <= right) {

            int leftElement = A[left];
            int rightElement = A[right];

            int middle = (left + right) / 2;

            // terminal step found here
            if (middle < right && A[middle] > A[middle + 1]) {
                return A[middle  + 1];
            }
            else if (leftElement > rightElement) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }

        return 0;
    }
}
