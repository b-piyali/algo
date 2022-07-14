package piyali.dsa.scaler.binary_search;

import java.util.ArrayList;

public class FoodPacketsDistribution {
    public int solve(ArrayList<Integer> A, int B) {
        int ans = -1;
        int left = 0;
        int right = Integer.MAX_VALUE;
        for (Integer integer : A) {
            right = Math.min(right, integer);
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isMinimum(A, mid, B)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (ans == -1) {
            return 0;
        } else {
            return ans;
        }
    }

    private boolean isMinimum(ArrayList<Integer> A, int mid, int B) {
        int sum = 0;
        for (int j : A) {
            if (mid == 0) {
                sum += j;
            } else {
                sum += (j / mid);
            }
        }
        return sum >= B;
    }
}
