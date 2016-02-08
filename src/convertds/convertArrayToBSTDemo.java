package convertds;/* Authored by Kushagra on 2/7/2016. */

import trees.TreeNode;

public class convertArrayToBSTDemo {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7};

        TreeNode root = sortedArrayToBST(A);
        root.inOrder();
    }

    private static TreeNode sortedArrayToBST(int[] A) {
        if (A.length == 0) return null;
        else return sortedArrayToBSTHelper(A, 0, A.length - 1);

    }

    private static TreeNode sortedArrayToBSTHelper(int[] A, int start, int end) {

        if (start > end)
            return null;

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(A[mid]);
        root.left = sortedArrayToBSTHelper(A, start, mid - 1);
        root.right = sortedArrayToBSTHelper(A, mid + 1, end);

        return root;
    }

    private static TreeNode convertArrayToBST(int[] A, int start, int end) {

        if (start >= end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(A[mid]);

        if (root != null) {
            root.left = convertArrayToBST(A, 0, mid - 1);
            root.right = convertArrayToBST(A, mid + 1, end);
        }

        return root;
    }
}
