package Recursion;

public class CountNoOfZeros {
    public static void main(String[] args) {
        int n = 610980650;
        countZer(n,0);
    }
    public static void countZer(int n, int zeros){
        if(n <= 0 )
        {
            System.out.println(zeros);
            return;
        }
        int c = n%10;
        if(c == 0)
        {
            zeros = zeros + 1;
        }
        n = n/10;
        countZer(n,zeros);
    }
}
