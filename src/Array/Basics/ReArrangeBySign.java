package Array.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ReArrangeBySign {
    static void main() {
        Scanner  sc  =  new Scanner(System.in);
        int n =  sc.nextInt();
        int a[]   =  new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=  sc.nextInt();
        }
        int p  =0;
        int ne  = 1;
        int res[] =  new int[n];
        for (int i = 0; i < n; i++) {
            if(a[i] > 0)
            {
                res[p] =  a[i];
                p+=2;
            }
            else {
                res[ne]=  a[i];
                ne+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
