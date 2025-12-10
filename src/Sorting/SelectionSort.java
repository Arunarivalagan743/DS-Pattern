package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
     Selection(arr,size);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Selection(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int last = size - 1 - i;  // to cut off the pass sorted elmnets
            int max = maxInd(arr,0,last); //to select the max index to swapw ith first or last
            swap(arr,last,max);
        }
    }
    public static void swap(int arr[],int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int maxInd(int[] arr, int start, int end) {
        int max = arr[start];
        int id = start;

        for(int i = start+1; i<=end; i++) {
          if(arr[i] < max) {
              id = i;
              max = arr[i];
          }
        }
        return id;
    }
}
