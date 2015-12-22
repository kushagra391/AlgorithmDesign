package trees;/* Authored by Kushagra on 12/19/2015. */

import sun.reflect.generics.tree.Tree;

public class TreeNode {

    int key;
    TreeNode left;
    TreeNode right;

    public TreeNode(int key) {
        this.key = key;
        left = right = null;
    }

    public static TreeNode getBT1() {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(3);
        root.left.right.left = new TreeNode(1);

        return root;
    }

    public static TreeNode getBadTree() {
        TreeNode root = new TreeNode(10);

        root.right = new TreeNode(21);
        root.right.right = new TreeNode(33);

        return root;
    }

    public static TreeNode getBST1() {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        return root;
    }

    public void inOrder() {
        TreeNode root = this;

        inorderUtil(root);
    }

    private void inorderUtil(TreeNode root) {
        if (root != null) {
            inorderUtil(root.left);
            System.out.println(root.key);
            inorderUtil(root.right);
        }
    }
}
