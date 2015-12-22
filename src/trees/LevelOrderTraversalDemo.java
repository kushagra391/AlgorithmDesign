package trees;/* Authored by Kushagra on 12/19/2015. */

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalDemo {

    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();
        levelOrderTraverse(root);
    }

    private static void levelOrderTraverse(TreeNode root) {

        if (root == null) return;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        int nodeCount;
        int height = 0;
        while (true) {

            nodeCount = Q.size();
            if (nodeCount == 0) {
                return;
            }

            height++;

            while (nodeCount > 0) {

                TreeNode node = Q.poll();

                if (node.left != null) Q.add(node.left);
                if (node.right != null) Q.add(node.right);

                System.out.println(height + " >> " + node.key);
                nodeCount--;
            }
        }

/*
        while(!Q.isEmpty()) {

            TreeNode node = Q.peek();

            // Add children nodes
            if (node.left != null) Q.add(node.left);
            if (node.right != null) Q.add(node.right);

            // print current node
            System.out.println(node.key);

            // remove the processed node
            Q.poll();
        }
        */
    }


}
