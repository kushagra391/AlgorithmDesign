package trees;/* Authored by Kushagra on 12/20/2015. */

public class IsHeightBalancedDemo {

    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();
        TreeNode root2 = TreeNode.getBadTree();


        System.out.println(HeightBalanced(root, new NodeHeight()));
        System.out.println(HeightBalanced(root2, new NodeHeight()));

        System.out.println(isHeightBalanced(root));
        System.out.println(isHeightBalanced(root2));

    }

    static class NodeHeight {

       private int height;

        NodeHeight() {
            this.height = 0;
        }

        NodeHeight(int height) {
            this.height = height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getHeight(){
            return this.height;
        }

    }

    private static boolean HeightBalanced(TreeNode root, NodeHeight nodeHeight) {

        if (root == null) {
            nodeHeight.setHeight(0);
            return true;
        }

        NodeHeight leftHeight = new NodeHeight();
        NodeHeight rightHeight = new NodeHeight();

        // update children height, and also recurse to determine if the child nodes are balanced
        boolean isLeftBalanced = HeightBalanced(root.left, leftHeight);
        boolean isRightBalanced = HeightBalanced(root.right, rightHeight);

        // update height of the current node
        nodeHeight.setHeight(1 + Math.max(leftHeight.getHeight(), rightHeight.getHeight()));

        // calculate diff
        int diff = Math.abs(leftHeight.getHeight() - rightHeight.getHeight());

        // return the final thing
        return (diff <= 1) &&
                isLeftBalanced &&
                isRightBalanced;
    }

    private static boolean isHeightBalanced(TreeNode root) {

        if (root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int diff = Math.abs(leftHeight - rightHeight);

        return (diff <= 1) &&
                isHeightBalanced(root.left) &&
                isHeightBalanced(root.right);

    }

    private static int height(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(height(root.left), height(root.right));
    }


}
