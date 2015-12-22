package trees;/* Authored by Kushagra on 12/14/2015. */

import java.util.*;

public class VerticalOrderTraversalDemo {

    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();

        VerticalOrderTraversal(root);
    }

    private static void VerticalOrderTraversal(TreeNode root) {

        if (root == null) return;

        HashMap<Integer, Queue<Integer>> map = new HashMap<>();

        traverse(root, map, 0);
        for (int key : map.keySet()) {
            Queue<Integer> Q = map.get(key);
            int topElement = Q.peek();
            System.out.println(topElement);
        }

    }

    private static void traverse(TreeNode root, HashMap<Integer, Queue<Integer>> map, int verticalLevel) {

        if (root == null) return;

        int key = root.key;
        Queue<Integer> Q;
        if (map.containsKey(verticalLevel)) {
            Q = map.get(verticalLevel);
        } else {
            Q = new LinkedList<>();
        }
        Q.add(key);
        map.put(verticalLevel, Q);


        traverse(root.left, map, verticalLevel - 1);
        traverse(root.right, map, verticalLevel + 1);
    }


    private static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }


    }

}
