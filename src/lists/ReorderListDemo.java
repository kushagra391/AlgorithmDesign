package lists;/* Authored by Kushagra on 2/6/2016. */

public class ReorderListDemo {

    public static void main(String[] args) {
        ListNode head = ListNode.List1();

        reroderList(head);

        head.printList();
    }

    private static void reroderList(ListNode head) {

        ListNode list1;
        ListNode list2;

        ListNode slow = head;
        ListNode fast = head;

        while (fast!= null && fast.next != null &&
                fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        list1 = head;
        list2 = slow.next;
        slow.next = null;
        /* two lists are prepared, now. */

        // reverse the second list
        ListNode reversedList = ReverseListDemo.reverse(list2);

        while(list2 != null) {
            list1.next = list2;
            list1 = list1.next;
            list2 = list2.next;
        }

    }

}
