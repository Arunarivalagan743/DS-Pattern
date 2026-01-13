package LinkedList.SLL;

public class LeetCode143_ReorderList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // -------- Solution Logic (Same as your accepted code) --------
    static class Solution {

        public void reorderList(ListNode head) {
            if (head == null || head.next == null) return;

            ListNode mid = middle(head);
            ListNode r = rev(mid.next);
            mid.next = null;

            ListNode l = head;

            while (r != null) {
                ListNode t1 = l.next;
                ListNode t2 = r.next;

                l.next = r;
                r.next = t1;

                l = t1;
                r = t2;
            }
        }

        static ListNode middle(ListNode head) {
            ListNode s = head;
            ListNode f = head.next;

            while (f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
            }
            return s;
        }

        static ListNode rev(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

    // -------- Main Method for Local Testing --------
    public static void main(String[] args) {

        // Example: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        Solution sol = new Solution();
        sol.reorderList(head);

        printList(head); // Expected: 1 -> 5 -> 2 -> 4 -> 3
    }

    // Helper function to print list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
