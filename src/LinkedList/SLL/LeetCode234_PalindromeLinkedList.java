package LinkedList.SLL;

public class LeetCode234_PalindromeLinkedList {

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

        public boolean isPalindrome(ListNode head) {

            if (head == null || head.next == null) return true;

            ListNode mid = midle(head);
            ListNode rev = r(mid);

            while (rev != null && head != null) {
                if (rev.val != head.val) {
                    break;
                }
                rev = rev.next;
                head = head.next;
            }

            return rev == null;
        }

        static ListNode midle(ListNode n) {
            ListNode s = n;
            ListNode f = n;

            while (f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
            }
            return s;
        }

        static ListNode r(ListNode m) {
            ListNode p = null;
            ListNode c = m;

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

        // Example 1: Palindrome -> 1 -> 2 -> 2 -> 1
        ListNode head1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(1))));

        // Example 2: Not Palindrome -> 1 -> 2
        ListNode head2 = new ListNode(1,
                new ListNode(2));

        Solution sol = new Solution();

        System.out.println(sol.isPalindrome(head1)); // true
        System.out.println(sol.isPalindrome(head2)); // false
    }
}
