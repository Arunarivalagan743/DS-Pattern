package LinkedList.SLL;

public class LeetCode202_HappyNumber {

    // -------- Solution Logic (Your Accepted Code) --------
    static class Solution {

        public boolean isHappy(int n) {

            int f = n;
            int s = n;

            do {
                s = sq(s);
                f = sq(sq(f));
            } while (f != s);

            return s == 1;
        }

        static int sq(int n) {
            int sum = 0;

            while (n > 0) {
                int r = n % 10;
                sum += r * r;
                n = n / 10;
            }
            return sum;
        }
    }

    // -------- Main Method for Local Testing --------
    public static void main(String[] args) {

        Solution sol = new Solution();

        int n1 = 19; // Happy number
        int n2 = 2;  // Not a happy number

        System.out.println(sol.isHappy(n1)); // true
        System.out.println(sol.isHappy(n2)); // false
    }
}
