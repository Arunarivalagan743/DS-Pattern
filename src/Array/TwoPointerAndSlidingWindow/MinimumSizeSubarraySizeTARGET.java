package Array.TwoPointerAndSlidingWindow;

import java.util.Scanner;

public class MinimumSizeSubarraySizeTARGET {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = sc.nextInt();   // target

        int curr = 0;
        int j = 0;

        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {

            curr += a[i];


            while (curr > sum && j <= i) {
                curr -= a[j];
                j++;
            }


            if (curr == sum) {
                first = j;
                last = i;
                break;
            }
        }

        if (first == -1 || last == -1) {
            System.out.println("-1");
        } else {
            System.out.println(first + " " + last);
        }
    }
}
