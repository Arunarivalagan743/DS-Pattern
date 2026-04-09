package Array.Basics;

import java.util.Scanner;

public class MajorityElement {
    static void main() {
        Scanner sc  =  new Scanner(System.in);
        int n =  sc.nextInt();
        int a[]   =  new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=  sc.nextInt();
        }
        int count = 0;
        int num = 0;

        for(int ne : a)
        {
            if(count == 0)
            {
                num = ne;
            }
            if(ne == num)
            {
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(num);
    }
}
