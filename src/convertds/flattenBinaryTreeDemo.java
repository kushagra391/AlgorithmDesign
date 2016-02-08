package convertds;/* Authored by Kushagra on 2/7/2016. */

import java.util.ArrayList;
import java.util.List;

public class flattenBinaryTreeDemo {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        int sum = 22;
        createDemoTree(root);
        printAllPaths(root, sum);

    }

    private static List<List<Integer>> printAllPaths(TreeNode root, int sum) {
        List<List<TreeNode>> paths = new ArrayList<>();
        List<List<Integer>> intPaths = new ArrayList<>();

        if (root == null) return intPaths;

        List<TreeNode> path = new ArrayList<>();

        printAllPathsHelper(root, path, paths, sum);

        getIntegralPaths(paths, intPaths);
        return intPaths;
    }

    private static void getIntegralPaths(List<List<TreeNode>> paths, List<List<Integer>> intPaths) {

        for (List<TreeNode> path : paths) {
            List<Integer> intPath = new ArrayList<>();

            for (TreeNode root : path) {
                intPath.add(root.val);
            }

            intPaths.add(intPath);
        }
    }

    private static void printAllPathsHelper(TreeNode root, List<TreeNode> path, List<List<TreeNode>> paths, int sum) {

        if (root == null) return;

        path.add(root);
        if (isLeaf(root)) {
            List<TreeNode> pathCopy = new ArrayList<>();
            for (TreeNode x : path) {
               pathCopy.add(x);
            }

            int currentSum = path.stream().mapToInt(x -> x.val).sum();
            if (sum == currentSum) {
                paths.add(pathCopy);
            }
        }

        printAllPathsHelper(root.left, path, paths, sum);
        printAllPathsHelper(root.right, path, paths, sum);

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
            System.out.println(node.val);
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

        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }

    private static void createDemoTree(TreeNode root) {
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.right = null;
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return this.val + "";
        }
    }
}
