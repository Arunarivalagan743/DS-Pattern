package LinkedList.SLL;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseByLeftAndRightLC92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        // Edge case
        if (head == null || left == right) return head;

        // Dummy node
        ListNode d = new ListNode(-1);
        d.next = head;

        ListNode lp = d;
        ListNode c = head;

        // Move pointers to correct positions
        for (int i = 1; i < left; i++) {
            lp = lp.next;
            c = c.next;
        }

        // Reverse sublist
        ListNode s = c;     // start of sublist
        ListNode pre = null;

        for (int i = 0; i <= right - left; i++) {
            ListNode next = c.next;
            c.next = pre;
            pre = c;
            c = next;
        }

        // Reconnect reversed sublist
        lp.next = pre;
        s.next = c;

        return d.next;
    }
}
