package BackTracking.MazeProblems;

import java.util.ArrayList;

public class Maz_One {
    public static void main(String[] args) {
 ArrayList<String>  al  = pathRetDiagonal("",3,3);
        System.out.println(al);

    }
    static int  maz(int r, int c)
    {
        if(r ==1 || c == 1)
        {
            return 1;
        }
      int  left  = maz(c-1,r);
        int down = maz(r-1,c);
        return left + down;
    }
    static void  mazpATH(String p,int r, int c)
    {
        if(r ==1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        if(r > 1)
        mazpATH(p + "D",r-1,c);
        if(c>1)
            mazpATH(p + "R",r,c-1);

    }
    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet(p + 'D', r-1, c));
        }

        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c-1));
        }

        return list;
    }
    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
        }

        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r-1, c));
        }

        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c-1));
        }

        return list;
    }
}
