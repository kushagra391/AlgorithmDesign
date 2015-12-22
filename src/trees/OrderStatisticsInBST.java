package trees;/* Authored by Kushagra on 12/19/2015. */

public class OrderStatisticsInBST {

    private static int rank = 0;
    private static int result = 0;

    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();
        int k = 3;

        System.out.println(findKthSmallest(root, k));
    }

    private static int findKthSmallest(TreeNode root, int k) {

        if (root == null) return 0;

        result += findKthSmallest(root.left, k);

        if (rank == k)
            result = root.key;
        else {
            rank++;
        }

        result += findKthSmallest(root.right, k);

        return result;
    }

    private static int inorder(TreeNode root, int k) {

        return 0;
    }
}
