package LinkedList.SLL;

public class LeetCode61_RotateList {

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

    // -------- Solution Logic (Your Accepted Code) --------
    static class Solution {

        public ListNode rotateRight(ListNode head, int k) {

            if (head == null || head.next == null || k == 0) return head;

            int len = 1;
            ListNode tail = head;

            while (tail.next != null) {
                tail = tail.next;
                len++;
            }

            k = k % len;
            if (k == 0) return head;

            // Make circular
            tail.next = head;

            ListNode newTail = head;
            for (int i = 0; i < len - k - 1; i++) {
                newTail = newTail.next;
            }

            ListNode newHead = newTail.next;
            newTail.next = null;

            return newHead;
        }
    }

    // -------- Main Method for Local Testing --------
    public static void main(String[] args) {

        // Example: 1 -> 2 -> 3 -> 4 -> 5, k = 2
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        int k = 2;

        Solution sol = new Solution();
        head = sol.rotateRight(head, k);

        printList(head); // Expected: 4 -> 5 -> 1 -> 2 -> 3
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
