package piyali.dsa.scaler.binary_search;

import java.util.ArrayList;

/**
 * Problem Description
 * Given a bitonic sequence A of N distinct elements, write a program to find a given element B
 * in the bitonic sequence in O(logN) time.
 * <p>
 * NOTE:
 * A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.
 * <p>
 * Problem Constraints
 * 3 <= N <= 105
 * 1 <= A[i], B <= 108
 * Given array always contain a bitonic point.
 * Array A always contain distinct elements.
 * <p>
 * Input Format
 * First argument is an integer array A denoting the bitonic sequence.
 * Second argument is an integer B.
 * <p>
 * Output Format
 * Return a single integer denoting the position (0 index based) of the element B in the array A if B doesn't exist in A return -1.
 */

public class SearchBitonicArray {
    public int solve(ArrayList<Integer> A, int B) {
        int maxValIndex = getHighIndex(A);
        if (A.get(maxValIndex) == B)
            return maxValIndex;
        int firstHalfIndex = searchFirst(A, B, maxValIndex, 0);
        if (firstHalfIndex != -1)
            return firstHalfIndex;

        return searchSecond(A, B, maxValIndex, A.size() - 1);
    }

    private int getHighIndex(ArrayList<Integer> arr) {
        int low = 0, high = arr.size() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < arr.get(mid + 1))
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    private int searchFirst(ArrayList<Integer> A, int B, int high, int low) {
        while (low <= high) {
            int mid = (high + low) / 2;
            if (A.get(mid) == B) {
                return mid;
            } else if (A.get(mid) < B) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int searchSecond(ArrayList<Integer> A, int B, int high, int low) {
        while (low > high) {
            int mid = (high + low) / 2;
            if (A.get(mid) == B) {
                return mid;
            } else if (A.get(mid) < B) {
                low = mid - 1;
            } else {
                high = mid + 1;
            }
        }
        return -1;
    }
}
