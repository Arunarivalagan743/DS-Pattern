package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimiFactorByTwq {
    static boolean prime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        int cnt =0;
        for (int i = 2; i <= n; i++) {
            if(n % i == 0)
            {
                cnt++;
            }
        }
        return cnt == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        int n  = sc.nextInt();
        int k  =sc.nextInt();
        for (int i  = 2;i<=k;i++)
        {
            System.out.println(prime(i));
            if(k % i == 0 && prime(i))
            {
             al.add(i);
            }
        }
        System.out.println(al);
        int cnt = 0;
        for (int i  = 0;i<al.size();i++)
        {
            int res = al.get(i) % n;
            System.out.println(res);
            if( al.get(i) % n == 0)
            {
                cnt++;
            }
        }
        if(cnt == al.size())
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
