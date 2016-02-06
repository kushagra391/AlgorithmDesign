package leetcode;/* Authored by Kushagra on 2/3/2016. */

public class ContainerWithMostWaterDemo {

    public static void main(String[] args) {

        int[] A = {1, 1, 2, 1, 1, 1, 4, 1, 0};
        // int[] A = {1, 1};
        System.out.println(findMaxContainer(A));

    }

    private static ContainerEdge findMaxContainer(int[] A) {

        ContainerEdge containerEdge = new ContainerEdge();

        // edge cases
        if (A == null) return null;
        if (A.length == 0) return containerEdge;
        if (A.length == 1) return containerEdge;

        // general case
        int leftEdge = 0;
        int rightEdge = A.length - 1;
        int max = 0;
        while (leftEdge < rightEdge) {
            int leftHeight = A[leftEdge];
            int rightHeight = A[rightEdge];

            int currentArea = Math.min(leftHeight, rightHeight) * (rightEdge - leftEdge);

            if (currentArea > max) {
                max = currentArea;
                containerEdge = new ContainerEdge(leftEdge, rightEdge, max);
            }

            // advance LR pointers
            if (leftHeight < rightHeight) {
                leftEdge++;
            }
            else {
                rightEdge--;
            }
        }

        return  containerEdge;
    }

    static class ContainerEdge {
        int leftEdge;
        int rightEdge;
        int area;

        public ContainerEdge(int leftEdge, int rightEdge, int area) {
            this.leftEdge = leftEdge;
            this.rightEdge = rightEdge;
            this.area = area;
        }

        public ContainerEdge() {
            leftEdge = rightEdge = 0;
        }

        public String toString() {

            String s1 = "Left Edge\t:" + leftEdge;
            String s2 = "Right Edge\t:" + rightEdge;
            String s3 = "Area\t\t:" + area;
            String newLine = "\n";
            return s1 + newLine + s2 + newLine + s3;
        }
    }

}
