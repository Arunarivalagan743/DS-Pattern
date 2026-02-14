package TwoPointer;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }


        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        ArrayList<Integer> al = new ArrayList<>();


        while (i < n1 && j < n2) {

            if (a[i] <= b[j]) {
                al.add(a[i]);
                i++;
            } else {
                al.add(b[j]);
                j++;
            }
        }


        while (i < n1) {
            al.add(a[i]);
            i++;
        }

        while (j < n2) {
            al.add(b[j]);
            j++;
        }


        System.out.println(al);
    }
}
