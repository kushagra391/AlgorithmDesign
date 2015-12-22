package recursion;

public class SumOneToNDemo {

    public static void main(String[] args) {

        int N = 3;

        int result = sumOneToN(N);
        System.out.println(result);
    }

    private static int sumOneToN(int n) {
        if (n < 1) return 0;
        if (n == 1) return n;

        return n + sumOneToN(n - 1);
    }


}
