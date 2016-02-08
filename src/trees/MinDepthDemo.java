package trees;/* Authored by Kushagra on 2/8/2016. */

public class MinDepthDemo {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getBST1();
        System.out.println(minDepth(root));
    }

    private static int minDepth(TreeNode root) {
        if (root == null) return 0;
        Depth d = new Depth(Integer.MAX_VALUE);

        int height = 0;
        minDepthHelper(root, height, d);
        return d.minDepth;
    }

    private static void minDepthHelper(TreeNode root, int height, Depth depth) {
        if (root == null) return;

        // update depth pointer
        if (isLeaf(root)) {
            depth.minDepth = Math.min(depth.minDepth, height);
            return;
        }

        depth.minDepth = depth.minDepth + 1;
        minDepthHelper(root.left, height + 1, depth);
        minDepthHelper(root.right, height + 1, depth);
    }

    private static boolean isLeaf(TreeNode root) {
        return (root.left == null && root.right == null);
    }

    private static class Depth {
        int minDepth;

        Depth(int height) {
            this.minDepth = height;
        }

    }
}
