package heaps;/* Authored by Kushagra on 12/13/2015. */

public class IsTreeHeapProblem {

    public static void main(String[] args) {


        Node root = new Node(97);
        root.left = new Node(46);
        root.right = new Node(37);
        root.left.left = new Node(12);
        root.left.right = new Node(3);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(9);
        root.right.left = new Node(7);
        root.right.right = new Node(31);

        System.out.println(isTreeHeap(root));

    }

    private static boolean isTreeHeap(Node root) {

        boolean isCompleteTree = isComplete(root);
        boolean satifiesHeap = doesSatifiesHeap(root);

        return isCompleteTree && satifiesHeap;
    }

    private static boolean doesSatifiesHeap(Node root) {

        if (root == null) return true;
        int key = root.key;

        if (root.left != null) {
            if (key < root.left.key) {
                return false;
            }
        }
        if (root.right != null) {
            if (key < root.right.key) {
                return false;
            }
        }

        return doesSatifiesHeap(root.left) && doesSatifiesHeap(root.right);
    }

    private static boolean isComplete(Node root) {

        return true;
    }


    private static class Node {

        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }

    }


}
