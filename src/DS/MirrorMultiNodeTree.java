package DS;/* Authored by Kushagra on 12/13/2015. */

import java.util.*;

public class MirrorMultiNodeTree {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.insert(new int[]{2, 34, 56, 100});
        Node node34 = root.getChild(34);
        node34.insert(1);
        Node node100 = root.getChild(100);
        node100.insert(new int[]{7, 8, 9});

        root.printTree();

        mirror(root);
        root.printTree();
    }

    private static void mirror(Node root) {

        if (root == null) return;

        List<Node> children = root.children;

        if (children.size() < 2) return;

        // recur for children
        for (Node child : children) {
            mirror(child);
        }

        // reverse children
        Collections.reverse(children);
    }


    @SuppressWarnings("Convert2streamapi")
    private static class Node {

        int key;
        List<Node> children;

        Node(int key) {
            this.key = key;
            children = new ArrayList<>();
        }

        void insert(int key) {
            Node node = new Node(key);
            children.add(node);
        }

        void insert(int[] keys) {

            for (int key : keys) {
                Node node = new Node(key);
                children.add(node);
            }

        }

        public Node getChild(int key) {

            for (Node child : children) {
                if (child.key == key) {
                    return child;
                }
            }

            return null;

        }

        public void printTree() {
            Queue<Node> Q = new LinkedList<Node>();
            Node node = this;

            Q.add(node);

            while (!Q.isEmpty()) {

                node = Q.peek();

                for (Node child : node.children) {
                    Q.add(child);
                }

                node = Q.remove();
                System.out.print(node.key + " ");
            }

            System.out.println();
        }
    }
}
