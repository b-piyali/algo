package piyali.dsa.scaler.dynamic_programming;

import java.util.Arrays;

public class MinimumNumberOfSquares {
    public int countMinSquares(int A) {
        if (A <= 0)
            return 0;

        int[] dp = new int[A + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        return count(A, dp);
    }

    private int count(int A, int[] dp) {
        if (A == 0)
            return 0;

        if (dp[A] == Integer.MAX_VALUE) {
            for (int i = 1; i <= Math.floor(Math.sqrt(A)); i++) {
                dp[A] = Math.min(dp[A], 1 + count(A - (i * i), dp));
            }
        }
        return dp[A];
    }
}
