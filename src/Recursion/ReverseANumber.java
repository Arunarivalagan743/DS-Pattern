package Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int n =  1234;
//        System.out.println((int)Math.log10(n) +1);
//        rev(0,n);
       int revnum =  rev(n);
       System.out.println(revnum);
    }
    public static void rev(int rev,int n) {
        if(n < 1)
        {
            System.out.println(rev);
            return;
        }
        rev = (rev*10)+n%10;
        rev(rev,n/10);
    }
    public static int rev(int n) {
        int d = (int)Math.log10(n);
        return help(n,d);

    }
    public static int help(int n,int d) {
        if(n < 10)
        {
            return 1;
        }
       int l = n % 10;
        return (int)((l * (int)Math.pow(10,d)) + help(n /10,d - 1));
    }
}
