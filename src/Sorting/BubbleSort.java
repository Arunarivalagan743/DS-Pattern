package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr,n);//swap adjacent elemet .It is know as sinking sort , exchange sort
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");  //stable algorthim follow the order
        }
        sc.close(); // time =  best ==> O(n) and in worst in O(n *n)
    }
    public static void BubbleSort(int[] a, int n) {
        for(int i  =0;i<n;i++) //it is counter to for make as pass to set largest at last index
        {
            boolean swap = false;
            for(int j  =0;j<n-1-i;j++)  // for every pass the largest elemnt is  set at last..so dont need to  in future pass no need to check adjacent elemnts in next pass.. so(n - i - 1)
            {

                if(a[j] < a[j+1]) // for checking j+1 leads to bound so , i reduce the loop as equal to j<=n - i - instaed i make as j< n - i-1for avoid index bound
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                        swap = true; //in the the every pass checking swap occurs
                }
            }
            if(swap == false) //no swap means break
            {
                break;

            }
        }
    }
}
