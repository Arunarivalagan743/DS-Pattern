package Array.TwoPointerAndSlidingWindow;
import java.util.*;
public class MaxiMumSumSizeK {


        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int n  =  sc.nextInt();
            int a[] = new int[n];
            for(int i =0;i<n;i++)
            {
                a[i] =  sc.nextInt();
            }
            int k  =  sc.nextInt();
            int max =   0;
            for(int i  =0;i<k;i++)
            {
                max +=a[i];
            }
            //1 2 3 4 5
            //3=> 1
            //3  -  a-[i - k] +
            int curr =max;

            for(int i  =  k;i<n;i++)
            {
                curr =  (max - a[i- k]) + a[i];
                max = Math.max(max,curr);
            }
            System.out.println(max);
        }
    }

