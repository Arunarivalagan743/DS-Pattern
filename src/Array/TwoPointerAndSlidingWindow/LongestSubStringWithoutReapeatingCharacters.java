package Array.TwoPointerAndSlidingWindow;

import java.util.ArrayList;

public class LongestSubStringWithoutReapeatingCharacters {

    public static void main(String[] args) {

        String s = "abcabcbb";

        ArrayList<Character> al = new ArrayList<>();

        int j = 0;
        int max = 0;
        int len = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);


            while (al.contains(c)) {
                al.remove(j);
            }

            al.add(c);

            len = al.size();

            max = Math.max(len, max);
        }

        System.out.println(max);
    }
}
