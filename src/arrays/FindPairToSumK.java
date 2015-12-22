package arrays;/* Authored by Kushagra on 12/19/2015. */

public class FindPairToSumK {
    public static void main(String[] args) {

        int[] A = {1, 2, 4, 6, 8, 11, 7};
        int k = 10;

        System.out.println(findPair(A, k));
        // other method is to use hashmap. Use the former if the array is already sorted
    }

    private static int findPair(int[] A, int k) {

        int left = 0;
        int right = A.length - 1;

        while (left < right) {

            int leftElement = A[left];
            int rightElement = A[right];
            int sum = leftElement + rightElement;

            // solution found
            if (sum == k) {
                System.out.println(leftElement + ", " + rightElement);
                return 1;
            }

            // decrease bets
            if (sum > k) {
                right --;
            }

            // increase bets
            if (sum < k) {
                left ++;
            }
        }

        return -1;
    }
}
