package Array.Basics;

import java.util.Scanner;

public class FindSecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int ss = secondSmall(arr);
//        System.out.println(ss);
        int sl  = secondLarge(arr);
        System.out.println(sl);
    }
//    private static int secondSmall(int[] arr) {
//        int smallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < smallest) {
//                secondSmallest = smallest;
//            smallest = arr[i];}
//            else if(arr[i]< secondSmallest && arr[i]!=smallest)
//            {
//                secondSmallest = arr[i];
//            }
//        }
//        return secondSmallest;
//    }
    private static int secondLarge(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >  largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i]!=largest)
            {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
