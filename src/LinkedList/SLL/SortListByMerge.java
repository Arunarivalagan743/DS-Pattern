package LinkedList.SLL;

/**
 * Definition for singly-linked list.
 */


public class SortListByMerge
    {

    public ListNode sortList(ListNode head) {
        return sort(head);
    }

    static ListNode sort(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Find middle
        ListNode mid = mid(head);
        ListNode right = mid.next;
        mid.next = null;

        // Sort halves
        ListNode left = sort(head);
        right = sort(right);

        // Merge sorted halves
        return merge(left, right);
    }

    static ListNode merge(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(-1);
        ListNode t = d;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                t.next = l1;
                l1 = l1.next;
            } else {
                t.next = l2;
                l2 = l2.next;
            }
            t = t.next;
        }

        // Attach remaining nodes
        if (l1 != null) t.next = l1;
        if (l2 != null) t.next = l2;

        return d.next;
    }

    static ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
