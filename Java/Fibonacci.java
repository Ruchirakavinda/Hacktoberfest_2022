public class Fibonacci {

    int[] dp = new int[31];

    public int fib(int n) {
        return Tabulation (n);
    }

    public int Tabulation (int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int s = 0, e = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = s + e;
            s = e;
            e = dp[i];

        }
        return dp[n];
    }
}