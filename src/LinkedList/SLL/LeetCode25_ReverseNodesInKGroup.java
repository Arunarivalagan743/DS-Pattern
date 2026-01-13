package LinkedList.SLL;

public class LeetCode25_ReverseNodesInKGroup {

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

        public ListNode reverseKGroup(ListNode head, int k) {

            ListNode temp = head;
            ListNode prev = null;

            while (temp != null) {

                ListNode kth = kthNode(temp, k);

                if (kth == null) {
                    if (prev != null) prev.next = temp;
                    break;
                }

                ListNode next = kth.next;
                kth.next = null;

                rev(temp);

                if (temp == head) {
                    head = kth;
                } else {
                    prev.next = kth;
                }

                prev = temp;
                temp = next;
            }

            return head;
        }

        static ListNode kthNode(ListNode t, int k) {
            k -= 1;
            while (t != null && k > 0) {
                t = t.next;
                k--;
            }
            return t;
        }

        static ListNode rev(ListNode head) {
            ListNode c = head;
            ListNode p = null;

            while (c != null) {
                ListNode next = c.next;
                c.next = p;
                p = c;
                c = next;
            }
            return p;
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
        head = sol.reverseKGroup(head, k);

        printList(head); // Expected: 2 -> 1 -> 4 -> 3 -> 5
    }

    // Helper method to print linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
