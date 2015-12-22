package trees;/* Authored by Kushagra on 12/19/2015. */

public class PrintAncestorsDemo {
    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();
        int key = 1;
        System.out.println(ancestor(root, key));
    }

    private static boolean ancestor(TreeNode root, int k) {

        if (root == null) return false;

        if (root.key == k) {
            return true;
        }

        if (ancestor(root.left, k) || ancestor(root.right, k)) {
            System.out.println(root.key);
            return true;
        }

        return false;
    }
}
