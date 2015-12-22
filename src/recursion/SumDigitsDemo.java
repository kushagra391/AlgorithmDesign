package recursion;/* Authored by Kushagra on 12/12/2015. */

public class SumDigitsDemo {

    public static void main(String[] args) {

        int N = 9741;

        int result = sumDigits(N);
        System.out.println(result);

    }

    private static int sumDigits(int N) {

        int digitsCount = getDigitCount(N);

        return sumDigitsUtil(N, digitsCount);
    }

    private static int getDigitCount(int n) {
        return 0;
    }

    private static int sumDigitsUtil(int n, int digitIndexFromLeft) {
        if (digitIndexFromLeft < 0) return 0;

        int currentDigit = getDigit(n, digitIndexFromLeft);

        return currentDigit + sumDigitsUtil(n, digitIndexFromLeft - 1);


    }

    private static int getDigit(int n, int index) {
        return 0;
    }


}
