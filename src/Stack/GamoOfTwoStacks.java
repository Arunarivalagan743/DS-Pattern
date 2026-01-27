package Stack;

import java.util.Arrays;

public class GamoOfTwoStacks {
    public static void main(String[] args) {
        int a[] = {4,2,4,6,1};
        int b[] ={2,1,8,5};
        int s =  10;
        int k  = twoStack(a,b,0,s,0) -1;
        System.out.println(k);
    }
    public  static int twoStack(int a[],int b[],int m,int s,int c)
    {
        if (m > s)
        {
            return c;
        }
        if(a.length  == 0|| b.length == 0)
        {
            return c;
        }
        int ak  = twoStack( Arrays.copyOfRange(a,1,a.length),b,m + a[0],s,c+1);
        int bk  = twoStack(a, Arrays.copyOfRange(b,1,b.length),m + b[0],s,c+1);
        return  Math.max(ak,bk);
    }
}
