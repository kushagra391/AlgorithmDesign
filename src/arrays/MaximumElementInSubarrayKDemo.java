package arrays;/* Authored by Kushagra on 2/7/2016. */

public class MaximumElementInSubarrayKDemo {

    public static void main(String[] args) {
        int[] A = {4, 2, 12, 34, 23, 35, 44, 55};
        int k = 3;
        System.out.println(maximumElementInSubarray(A, k));
    }


    // Method1: Brute Force
    // Method2: Use AVL. Space: k, Time: nlogk
    // Method3:
    private static int maximumElementInSubarray(int[] A, int k) {

        AVLTree tree = new AVLTree();
        for (int i=0; i<k; i++) {
            tree.insert(A[i]);
        }

        for (int i=k; i < A.length; i++) {
            int maxElement = tree.getMax();

            tree.remove(maxElement);
            tree.insert(A[i]);

            System.out.println(maxElement);
        }

        return 0;
    }

    private static class AVLTree {
        private AVLTreeNode root;

        AVLTree() {
            this.root = null;
        }

        public void insert(int key) {
        }

        public void remove(int maxElement) {
        }

        public int getMax() {
            return 0;
        }
    }


    private static class AVLTreeNode {
        int key;
        AVLTreeNode left, right;

        public AVLTreeNode(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
}
