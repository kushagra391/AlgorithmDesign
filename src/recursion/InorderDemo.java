package recursion;/* Authored by Kushagra on 12/12/2015. */

public class InorderDemo {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(16);
        root.left.left = new Node(15);
        root.left.right = new Node(3);

        inOrder(root);
    }

    private static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }


    static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }


}
