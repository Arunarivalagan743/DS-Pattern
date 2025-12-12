package Recursion;

import java.util.Scanner;

public class ProductOfNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  5;
        pro(1,n);
    }
    public static void pro(int n,int n1){
        if(n1 < 1)
        {
            System.out.println("product" + " "+n);
            return;
        }
        n = n*(n1);
        pro(n,n1-1);
    }
}
