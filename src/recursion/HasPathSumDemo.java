package recursion;/* Authored by Kushagra on 12/12/2015. */

public class HasPathSumDemo {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(9);

        System.out.println(HasPathSum(root, 20));

    }

    private static boolean HasPathSum(Node root, int sum) {
        return HasPathSumUtil(root, sum, 0);
    }

    private static boolean HasPathSumUtil(Node root, int sum, int pathSum) {
        if (root == null) return false;

        pathSum = pathSum + root.key;
        return HasPathSumUtil(root.left, sum, pathSum) || HasPathSumUtil(root.right, sum, pathSum);


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
