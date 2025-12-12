package Recursion;

import java.util.Scanner;

public class SumOFDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1234;
        sumDigits(n,0);

    }
    public static void sumDigits(int n,int sum) {
        if(n == 0)
        {
            System.out.println(sum);
            return;
        }
        sumDigits(n/10,sum+(n%10));

    }
}
