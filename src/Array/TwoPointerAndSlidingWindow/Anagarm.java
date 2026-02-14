package Array.TwoPointerAndSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class Anagarm {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char arr[] = b.toCharArray();
        Arrays.sort(arr);
        int k  = arr.length;
        int c =0;
        for (int i = 0; i < a.length() - k +1; i++) {
            String res = a.substring(i,i+k);
            char rk[]  =  res.toCharArray();
            Arrays.sort(rk);
            if(Arrays.equals(rk,arr))
            {
                c++;
            }
        }
        System.out.println(c);

    }
}
