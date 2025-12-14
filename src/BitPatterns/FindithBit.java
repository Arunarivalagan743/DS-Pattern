package BitPatterns;

public class FindithBit {
    public static void main(String[] args) {
                            //16 8  4 2 1
        int n  = 10;        //0  1  0  1 0

        int i  = 3;         //0  1   0 0 0
        int f = bit(n,i);
        System.out.println(f);
    }
    public static int bit(int n, int i) {
        if((n &(1<< (i - 1))) == 0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
}
