package lists;/* Authored by Kushagra on 2/8/2016. */

public class PartionListDemo {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        buildList(head);
        printList(head);

        int k = 3;
        head = partitionList(head, k);


        printList(head);

    }

    private static ListNode partitionList(ListNode head, int k) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);

        ListNode fakehead1 = head1;
        ListNode fakehead2 = head2;

        ListNode pivot = null;
        ListNode node = head;
        while (node != null) {

            int key = node.key;

            if (key < k) {
                head1.next = node;
                head1 = head1.next;
            }

            if (key > k) {
                head2.next = node;
                head2 = head2.next;
            }

            if (key == k) {
                pivot = node;
            }

            node = node.next;
        }

        head1.next = pivot;
        assert pivot != null;
        pivot.next = fakehead2.next;

        return fakehead1.next;
    }

    private static void printList(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.key + " ");
            node = node.next;
        }

        System.out.println();
    }

    private static void buildList(ListNode head) {
        head.next = new ListNode(5);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(7);
    }


}
