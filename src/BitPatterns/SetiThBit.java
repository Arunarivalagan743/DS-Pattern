package BitPatterns;

public class SetiThBit {
    public static void main(String[] args) {
        //16 8  4 2 1
        int n  = 10;        //0  1  0  1 0

        int i  = 2;         //0  1   0 0 0
      int k = (n | (1<<(i -1)));
      String s = Integer.toBinaryString(k);
        System.out.println(s);

    }

    }

