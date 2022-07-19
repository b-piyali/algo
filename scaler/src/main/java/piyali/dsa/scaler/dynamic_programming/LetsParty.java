package piyali.dsa.scaler.dynamic_programming;

import java.util.Arrays;

public class LetsParty {
    public int solve(int A) {
        if (A == 1)
            return 1;
        int[] dp = new int[A + 1];
        Arrays.fill(dp, -1);
        return compute(A, dp);
    }

    private int compute(int num, int[] dp) {
        if (num == 1 || num == 2)
            return dp[num] = num;

        if (dp[num] == -1)
            dp[num] = (compute(num - 1, dp) + (num - 1) * compute(num - 2, dp)) % 10003;

        return dp[num];
    }
}
