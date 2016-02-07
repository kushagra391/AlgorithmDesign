package convertds;/* Authored by Kushagra on 2/7/2016. */

import java.util.ArrayList;
import java.util.List;

public class flattenBinaryTreeDemo {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        createDemoTree(root);
        printAllPaths(root);

//        printTree(root);
//        root = flattenBinaryTree(root);
//        printFlattenedTree(root);

    }

    private static void printAllPaths(TreeNode root) {
        if (root == null) return;

        List<TreeNode> path = new ArrayList<>();

        printAllPathsHelper(root, path);
    }

    private static void printAllPathsHelper(TreeNode root, List<TreeNode> path) {

        if (root == null) return;
        path.add(root);
        if (isLeaf(root)) {
            System.out.println(path.toString());
        }

        printAllPathsHelper(root.left, path);
        printAllPathsHelper(root.right, path);

        // backtrack -- important step
        path.remove(root);
    }

    private static boolean isLeaf(TreeNode root) {

        return (root.left == null && root.right == null);

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

        @Override
        public String toString() {
            return this.key + "";
        }
    }
}
