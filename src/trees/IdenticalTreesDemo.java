package trees;/* Authored by Kushagra on 12/20/2015. */

public class IdenticalTreesDemo {
    public static void main(String[] args) {

        TreeNode root1 = TreeNode.getBST1();
        TreeNode root2 = TreeNode.getBT1();

        System.out.println(isIdentical(root1, root2));


    }

    private static boolean isIdentical(TreeNode r, TreeNode s) {

        if (r == null && s == null) {
            return true;
        }

        if (r != null && s != null) {
            return
                    (r.key == s.key &&
                            isIdentical(r.left, s.left) &&
                            isIdentical(r.right, s.right));
        }

        return false;
    }
}
