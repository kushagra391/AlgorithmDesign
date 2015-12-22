package lists;/* Authored by Kushagra on 12/20/2015. */

public class ListNode {

    int key;
    ListNode next;

    ListNode(int key) {
        this.key = key;
        this.next = null;
    }

    public static ListNode List1() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        return node;
    }

    public void printList() {
        ListNode node = this;

        while (node != null) {
            System.out.print(node.key + " ");
            node = node.next;
        }

        System.out.println();
    }

}
