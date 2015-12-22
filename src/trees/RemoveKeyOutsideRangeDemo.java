package trees;/* Authored by Kushagra on 12/19/2015. */

public class RemoveKeyOutsideRangeDemo {

    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();
        root.inOrder();

        int min = 2;
        int max = 5;
        root = removeKeys(root, min, max);

        System.out.println();
        root.inOrder();
    }

    private static void changeRoot(TreeNode root) {
        root.key = -1;
    }

    private static TreeNode removeKeys(TreeNode root, int min, int max) {

        if (root == null) return null;

        root.left = removeKeys(root.left, min, max);
        root.right = removeKeys(root.right, min, max);

        int key = root.key;
        if (key < min) {
            root = root.right;
        }
        if (key > max) {
            root = root.left;
        }

        return root;
/*
        if (key >= min && key <= max) {
            // do nothing
        }
*/
    }


}
