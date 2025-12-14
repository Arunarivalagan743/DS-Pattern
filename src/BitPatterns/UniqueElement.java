package BitPatterns;

public class UniqueElement {
    public static void main(String[] args) {
        int a[] ={1,2,3,2,3,4,5,5,4,6,6};//wrks for dup count of 2 only a ^ a = 0 only two
        int ans = unique(a);
        System.out.println(ans);
    }
    public static int unique(int a[])
    {
        int u  = 0;
        for (int i = 0; i <  a.length;i++) {
            u^=a[i];

        }
        return u;
    }
}
