package Array.TwoPointerAndSlidingWindow;

import java.util.Scanner;

public class MinimumSizeSubarraySumlessthanTarget {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        int len = 0;
        int j = 0;
        int sum = 0;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            sum += a[i];


            while (sum >= t) {

                len = i - j + 1;
                min = Math.min(min, len);

                sum -= a[j];
                j++;
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("0");
        } else {
            System.out.println(min);
        }
    }
}
