package piyali.dsa.scaler.dynamic_programming;

import java.util.Arrays;

public class Stairs {
    public int climbStairs(int A) {
        int[] dp = new int[A + 1];
        Arrays.fill(dp, -1);
        return compute(A, dp);
    }

    private int compute(int num, int[] dp) {
        if (num == 1 || num == 2)
            return dp[num] = num;
        if (dp[num] == -1)
            dp[num] = compute(num - 1, dp) + compute(num - 2, dp);

        return dp[num];
    }
}
