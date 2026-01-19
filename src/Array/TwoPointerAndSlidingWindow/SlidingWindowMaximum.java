package Array.TwoPointerAndSlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int a[] = {1,3,-1,-3,5,3,6,7};
        int k  =3;
        int res[] =maxSlidingWindow(a, k);
        System.out.println(Arrays.toString(res));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
     int n  = nums.length;
     int res[] = new int[n  - k + 1];
     int id =0;
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if(!d.isEmpty() && d.peekFirst() < i -  k)
            {
                d.pollFirst();
            }
            while(!d.isEmpty() && nums[d.peekLast()] < nums[i])
            {
                d.pollLast();
            }
            d.addLast(i);
            if(i>=k - 1)
            {
                res[id++] = nums[d.peekFirst()];
            }

        }
        return res;
    }
}
