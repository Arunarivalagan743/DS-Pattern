package TwoPointer;

import  java.util.Scanner;


public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k =  removeDup(arr);
        for (int i = 0; i <k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDup(int[] a) {
        int j  =1;
        for (int i = 1; i < a.length; i++) {
            if(a[i]!=a[i-1])
            {
                a[j++] = a[i];
            }
        }
        return j;
    }
}
