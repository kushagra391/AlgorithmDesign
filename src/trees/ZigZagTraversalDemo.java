package trees;/* Authored by Kushagra on 12/19/2015. */

import java.util.*;

public class ZigZagTraversalDemo {
    public static void main(String[] args) {

        TreeNode root = TreeNode.getBST1();
        ZigZagTraversal(root);

    }

    private static void ZigZagTraversal(TreeNode root) {

        if (root == null) return;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        int height = 0;
        int nodeCount;
        Map<Integer, List<TreeNode>> map = new HashMap<>();

        while (true) {

            // return if the complete tree is traversed
            if (Q.isEmpty()) {
                break;
            }

            // node for the current height
            nodeCount = Q.size();

            // map init
            map.put(height, new ArrayList<TreeNode>());

            // loop till the nodes of the current level get exhausted
            while (nodeCount > 0) {

                TreeNode node = Q.peek();

                if (node.left != null) Q.add(node.left);
                if (node.right != null) Q.add(node.right);

                addToMap(map, height, node);

                Q.poll();
                nodeCount--;
            }

            height++;
        }

        printResults(map);
    }

    private static void printResults(Map<Integer, List<TreeNode>> map) {

        int index = 0;
        for (int key : map.keySet()) {

            List<TreeNode> list = map.get(key);

            if (index % 2 != 0) {
                Collections.reverse(list);
            }

            for (TreeNode node : list) {
                System.out.print(node.key + " ");
            }

            System.out.println();
            index++;
        }
    }

    private static void addToMap(Map<Integer, List<TreeNode>> map, int height, TreeNode node) {

        if (map.containsKey(height)) {
            List<TreeNode> list = map.get(height);
            list.add(node);
        } else {
            ArrayList<TreeNode> list = new ArrayList<>();
            list.add(node);
            map.put(height, list);
        }
    }
}
