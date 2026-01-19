package Array.TwoPointerAndSlidingWindow;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        int l = 0, r = 0;
        int min = Integer.MAX_VALUE;
        int cnt = t.length();
        int st = 0;

        int[] hash = new int[128];
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }

        while (r < s.length()) {
            char ch = s.charAt(r);

            if (hash[ch] > 0) cnt--;
            hash[ch]--;
            r++;

            while (cnt == 0) {
                if (r - l < min) {
                    min = r - l;
                    st = l;
                }

                char lc = s.charAt(l);
                hash[lc]++;
                if (hash[lc] > 0) cnt++;
                l++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(st, st + min);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); // BANC
    }
}
