package recursion;/* Authored by Kushagra on 12/12/2015. */

public class SearchBSTDemo {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(9);

        System.out.println(searchBST(root, 5));

    }

    private static boolean searchBST(Node root, int key) {

        if (root == null) return false;

        if (root.key == key) return true;

        return searchBST(root.left, key) || searchBST(root.right, key);
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
