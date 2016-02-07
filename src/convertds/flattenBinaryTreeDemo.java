package convertds;/* Authored by Kushagra on 2/7/2016. */

public class flattenBinaryTreeDemo {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        createDemoTree(root);
//        printTree(root);

        root = flattenBinaryTree(root);

        printFlattenedTree(root);

    }

    private static void printFlattenedTree(TreeNode root) {
        System.out.println("Printing Flattened Tree");

        if (root == null) return;

        TreeNode node = root;
        while (node != null) {
            System.out.println(node.key);
            node = node.right;
        }
    }

    // trying out a recursive solution approach
    // try a iterative approach instead
    // again
    private static TreeNode flattenBinaryTree(TreeNode root) {

        if (root == null) return null;

        TreeNode rightSubTree = root.right;
        root.right = flattenBinaryTree(root.left);
        root.left = null;

        TreeNode node = root.right;
        if (node != null) {
            while (node.right != null) {
                node = node.right;
            }

            node.right = flattenBinaryTree(rightSubTree);
        }

        return root;
    }

    private static void printTree(TreeNode root) {
        if (root == null) return;

        System.out.println(root.key);
        printTree(root.left);
        printTree(root.right);
    }

    private static void createDemoTree(TreeNode root) {
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = null;
        root.right.right = new TreeNode(6);
    }

    static class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;

        TreeNode(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
}
