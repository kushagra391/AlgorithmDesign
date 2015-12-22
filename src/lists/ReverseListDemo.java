package lists;/* Authored by Kushagra on 12/20/2015. */

public class ReverseListDemo {
    public static void main(String[] args) {

        ListNode list = ListNode.List1();
        list.printList();

        list = reverse(list);
        list.printList();

    }


    private static ListNode reverse(ListNode head) {

        if (head == null) return null;      // size = 0
        if (head.next == null) return head; // size == 1


        // third question - in Lisp this is easy, but we don't have cons
        // so we grab the second element (which will be the last after we reverse it)
        ListNode rest = head.next;

        // bug fix - need to unlink list from the rest or you will get a cycle
        head.next = null;

        // then we reverse everything from the second element on
        ListNode reverseRest = reverse(rest);

        // then we join the two lists
        rest.next = head;

        return reverseRest;

    }


    @SuppressWarnings("UnnecessaryLocalVariable")
    private static void reverseList(ListHead listhead) {

        if (listhead.head == null) {
            return;
        }

        ListNode first = listhead.head;
        ListNode rest = first.next;

        if (rest == null)
            return;

        reverseList(new ListHead(rest));
        first.next.next = first;

        first.next = null;

        listhead.head = rest;

    }
}
