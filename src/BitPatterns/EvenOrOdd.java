package BitPatterns;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 81;
        boolean ans = check(n);
        System.out.println(ans);
    }
    public static boolean check(int n) {
        if((n&1) == 0)
        {
            return true;
        }
        return false;
    }
}
