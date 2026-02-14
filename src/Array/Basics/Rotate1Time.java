package Array.Basics;

import java.util.Arrays;

public class Rotate1Time {
    public static void main(String[] args) {
        int a[] = {-1,0,6,3};
        rotate(a,0,a.length - 1);
        rotate(a,0,a.length - 2);
        System.out.println(Arrays.toString(a));

    }
    public static void rotate(int[] a, int left, int right) {
        while(left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}
