package piyali.dsa.scaler.binary_search;

import java.util.ArrayList;

/**
 * Problem Description
 * Given a matrix of integers A of size N x M in which each row is sorted.
 * Find and return the overall median of matrix A.
 * <p>
 * NOTE: No extra memory is allowed.
 * <p>
 * NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 10^5
 * 1 <= N*M <= 10^6
 * 1 <= A[i] <= 10^9
 * N*M is odd
 * <p>
 * Input Format
 * The first and only argument given is the integer matrix A.
 * <p>
 * Output Format
 * Return the overall median of matrix A.
 * <p>
 * Example Input
 * Input 1:
 * A = [   [1, 3, 5],
 * [2, 6, 9],
 * [3, 6, 9]   ]
 * <p>
 * Input 2:
 * A = [   [5, 17, 100]    ]
 * <p>
 * Example Output
 * Output 1:
 * 5
 * <p>
 * Output 2:
 * 17
 */

public class MatrixMedian {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int rowLen = A.size();
        int colLen = A.get(0).size();

        for (ArrayList<Integer> rows : A) {
            max = Math.max(max, rows.get(colLen - 1));
            min = Math.min(min, rows.get(0));
        }

        int l = min;
        int r = max;
        int ans = r;
        int k = (colLen * rowLen) >> 1; // median k = (min*max)/2

        while (l <= r) {
            int mid = (l + r) >> 1;
            int count = 0;
            for (ArrayList<Integer> rows : A) {
                count += countlessSorted(rows, mid);
            }
            if (count > k) {
                r = mid - 1; // when count is greater than the k then neglect right side
            } else {
                ans = mid; //when count<=k
                l = mid + 1;
            }
        }
        return ans;
    }

    // no of ele smaller than the mid
    private static int countlessSorted(ArrayList<Integer> A, int mid) {
        int count = 0;
        for (int val : A) {
            if (val < mid) {
                count++;
            }
        }
        return count;
    }
}
