package LinkedList.SLL;

/**
 * Definition for singly-linked list.
 */


public class ReverseSLL2LC142 {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find cycle length
                int length = cycleLength(slow);

                // Step 3: Find start of cycle
                ListNode first = head;
                ListNode second = head;

                while (length > 0) {
                    second = second.next;
                    length--;
                }

                while (first != second) {
                    first = first.next;
                    second = second.next;
                }

                return first; // cycle start
            }
        }

        return null; // no cycle
    }

    static int cycleLength(ListNode node) {
        int length = 0;
        ListNode temp = node;

        do {
            temp = temp.next;
            length++;
        } while (temp != node);

        return length;
    }
}
