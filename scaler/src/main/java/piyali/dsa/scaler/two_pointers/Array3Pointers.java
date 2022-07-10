package piyali.dsa.scaler.two_pointers;

import java.util.List;

/**
 * Problem Description
 * You are given 3 sorted arrays A, B and C.
 * Find i, j, k such that :
 * max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) is minimized.
 * Return the minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])).
 * <p>
 * Problem Constraints
 * 0 <= len(A), len(B), len(c) <= 106
 * 0 <= A[i], B[i], C[i] <= 107
 * <p>
 * Input Format
 * First argument is an integer array A.
 * Second argument is an integer array B.
 * Third argument is an integer array C.
 * <p>
 * Output Format
 * Return an single integer denoting the minimum
 * max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])).
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 4, 10]
 * B = [2, 15, 20]
 * C = [10, 12]
 * <p>
 * Input 2:
 * A = [3, 5, 6]
 * B = [2]
 * C = [3, 4]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 5
 * <p>
 * Output 2:
 * 1
 */

public class Array3Pointers {
    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int first = 0;
        int second = 0;
        int third = 0;
        int ans = Integer.MAX_VALUE;

        while (first < A.size() && second < B.size() && third < C.size()) {
            ans = Math.min(ans,
                    Math.max(Math.abs(A.get(first) - B.get(second)),
                            Math.max(Math.abs(B.get(second) - C.get(third)),
                                    Math.abs(C.get(third) - A.get(first)))));

            int compare = Math.min(A.get(first), Math.min(B.get(second), C.get(third)));
            if (compare == A.get(first))
                first++;
            else if (compare == B.get(second))
                second++;
            else
                third++;
        }
        return ans;
    }
}
