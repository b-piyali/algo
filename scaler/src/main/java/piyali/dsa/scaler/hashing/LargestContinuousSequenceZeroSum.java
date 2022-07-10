package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * Given an array A of N integers.
 * Find the largest continuous sequence in a array which sums to zero.
 * <p>
 * Problem Constraints
 * 1 <= N <= 106
 * -107 <= A[i] <= 107
 * <p>
 * Input Format
 * Single argument which is an integer array A.
 * <p>
 * Output Format
 * Return an array denoting the longest continuous sequence with total sum of zero.
 * <p>
 * NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.
 */
public class LargestContinuousSequenceZeroSum {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> subArray = new ArrayList<>();
        Map<Integer, Integer> preSumIndex = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        int start = 1;
        int end = 0;
        preSumIndex.put(0, -1);
        for (int i = 0; i < A.size(); ++i) {
            sum += A.get(i);
            if (preSumIndex.containsKey(sum)) {
                int len = i - preSumIndex.get(sum);
                if (maxLen < len) {
                    maxLen = len;
                    start = preSumIndex.get(sum) + 1;
                    end = i;
                }
            } else {
                preSumIndex.put(sum, i);
            }
        }
        for (int i = start; i <= end; ++i) {
            subArray.add(A.get(i));
        }

        return subArray;
    }
}
