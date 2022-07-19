package piyali.dsa.scaler.dynamic_programming;

public class DiceThrow {
    private final static long mod = 1000000007;

    public int solve(int A) {
        if (A == 0)
            return 0;

        int[] dp = new int[A + 1];
        return diceSum(A, dp);
    }

    private int diceSum(int num, int[] dp) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= 6 && i >= j; j++) {
                dp[i] += dp[i - j];
                dp[i] %= mod;
            }
        }
        return dp[num];
    }
}
