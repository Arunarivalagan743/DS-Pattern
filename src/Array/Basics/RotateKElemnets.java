package Array.Basics;

import java.util.Scanner;

public class RotateKElemnets {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int r = sc.nextInt();
            int d = r % n;
            p(arr,0, arr.length - 1);
            p(arr, 0, d - 1);
            p(arr, d, arr.length - 1);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }
        public static void p(int[] arr,int s,int e) {
            while(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
    }


