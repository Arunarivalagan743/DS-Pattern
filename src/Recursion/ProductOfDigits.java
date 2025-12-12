package Recursion;

import java.util.Scanner;

public class ProductOfDigits {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 1234;
            ProDigits(n,1);

        }
        public static void ProDigits(int n,int product) {
            if(n == 0)
            {
                System.out.println(product);
                return;
            }
            ProDigits(n/10,product*(n%10));

        }
    }


