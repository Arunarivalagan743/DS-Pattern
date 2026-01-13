package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {
    static  int p(char c)
    {
        if(c== '+' || c =='-' )return 1;
        if (c=='*' || c =='/') return 2;
        if (c=='^')return 3;
        return -1;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =  sc.next();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                sb.append(String.valueOf(c));
            }
            else if(c == '(')
            {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(')
                {
                    sb.append(String.valueOf(st.pop()));
                }
                st.pop();

            }
            else {
                while (!st.isEmpty() &&
                        (p(st.peek()) > p(c) ||
                                (p(st.peek()) == p(c) && c != '^'))) {
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty())
        {
            sb.append(String.valueOf(st.pop()));
        }
        System.out.println(sb.toString());
    }
}
