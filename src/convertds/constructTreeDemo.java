package convertds;/* Authored by Kushagra on 2/8/2016. */

import trees.TreeNode;

public class constructTreeDemo {

    public static void main(String[] args) {

        int[] inOrder = {};
        int[] postOrder = {};

        TreeNode root = constructTree(inOrder, postOrder);
    }

    private static TreeNode constructTree(int[] inOrder, int[] postOrder) {

        int start = 0;
        int end = inOrder.length - 1;

        return constructTreeHelper(inOrder, start, end, postOrder, start, end);
    }

    private static TreeNode constructTreeHelper(int[] inOrder, int startIn, int endIn,
                                                int[] postOrder, int startPost, int endPost) {


        /*
        if (startIn > endIn) {
            return null;
        }

        // identify root
        TreeNode root = new TreeNode(postOrder[endPost]);

        int rootIndex = getRootIndexInInorder(inOrder);

        // identify leftSubtree
        startIn = 0;
        endIn = rootIndex - 1;

        startPost = 0;
        endPost = getRightMostIndex(postOrder, inOrder[endIn]) - 1;

        root.left =  constructTreeHelper(inOrder, startIn, endIn, postOrder, startPost, endPost);

        // identify rightSubtree
        startIn = rootIndex + 1;

        startPost = getRightMostIndex(postOrder, inOrder[endIn])



        // recurse
        */
        return null;
    }


}
