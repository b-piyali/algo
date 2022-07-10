package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem Description
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 100000
 * <p>
 * -10^9 <= A[i] <= 10^9
 * <p>
 * Input Format
 * The only argument given is the integer array A.
 * <p>
 * Output Format
 * Return whether the given array contains a subarray with a sum equal to 0.
 */

public class SubArrayWith0Sum {
    public int solve(ArrayList<Integer> A) {
        Map<Long, Integer> map = new HashMap<>();

        long pref = 0;
        map.put(0L, 0);
        for (int i = 0; i < A.size(); i++) {
            pref = pref + (A.get(i));
            if (map.containsKey(pref)) {
                return 1;
            } else {
                map.put(pref, i);
            }
        }
        return 0;
    }
}
