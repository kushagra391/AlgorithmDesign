package trees;/* Authored by Kushagra on 12/19/2015. */

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderWidthDemo {

    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();
        System.out.println(width(root));

    }

    private static int width(TreeNode root) {

        if (root == null) return 0;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        int nodeCount;
        int height = 0;
        int width;
        int maxWidth = -1;
        while (true) {

            nodeCount = Q.size();
            if (nodeCount == 0) {
                return maxWidth;
            }

            height++;
            width = 0;

            while (nodeCount > 0) {

                TreeNode node = Q.poll();

                if (node.left != null) Q.add(node.left);
                if (node.right != null) Q.add(node.right);

                nodeCount--;
                width++;
            }

            System.out.println("Height: " + height + ", " + "Width: " + width);
            maxWidth = Math.max(width, maxWidth);
        }
    }
}
