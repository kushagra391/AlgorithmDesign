package trees;/* Authored by Kushagra on 12/19/2015. */

public class DiameterDemo {
    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();

        System.out.println(diameter(root));
    }

    private static int diameter(TreeNode root) {

        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int pathLength = leftHeight + rightHeight;

        int leftDiamter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return max3(pathLength, leftDiamter, rightDiameter);
    }

    private static int max3(int a, int b, int c) {

        int max_ab = Math.max(a, b);
        return Math.max(max_ab, c);
    }

    private static int height(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
