package Array.Basics;

public class SimulationCount {

    static final int MAX = 100005;

    // Return the cost to convert two numbers into consecutive primes
    static int cost(int a, int b, int prev[], int nxt[]) {
        int sub = a + b;

        if (a <= b && prev[b - 1] >= a) {
            return nxt[b] + prev[b - 1] - a - b;
        }

        a = Math.max(a, b);
        a = nxt[a];
        b = nxt[a + 1];

        return a + b - sub;
    }

    // Sieve to store next and previous prime
    static void sieve(int prev[], int nxt[]) {
        int pr[] = new int[MAX];

        pr[1] = 1;
        for (int i = 2; i < MAX; i++) {
            if (pr[i] == 1) continue;
            for (int j = i * 2; j < MAX; j += i) {
                pr[j] = 1;
            }
        }

        // next prime
        for (int i = MAX - 2; i > 0; i--) {
            if (pr[i] == 0) nxt[i] = i;
            else nxt[i] = nxt[i + 1];
        }

        // previous prime
        for (int i = 1; i < MAX; i++) {
            if (pr[i] == 0) prev[i] = i;
            else prev[i] = prev[i - 1];
        }
    }

    // Return minimum operations
    static int minOperation(int arr[], int nxt[], int prev[], int n) {
        int dp[][] = new int[n + 5][n + 5];

        for (int r = 0; r < n; r++) {
            for (int l = r - 1; l >= 0; l -= 2) {
                dp[l][r] = Integer.MAX_VALUE;

                for (int ad = l; ad < r; ad += 2) {
                    dp[l][r] = Math.min(
                            dp[l][r],
                            dp[l][ad] +
                                    dp[ad + 1][r - 1] +
                                    cost(arr[ad], arr[r], prev, nxt)
                    );
                }
            }
        }

        return dp[0][n - 1] + n / 2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3};
        int n = arr.length;

        int nxt[] = new int[MAX];
        int prev[] = new int[MAX];

        sieve(prev, nxt);

        System.out.println(minOperation(arr, nxt, prev, n));
    }
}
