package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * Given two arrays of integers A and B of size N each,
 * where each pair (A[i], B[i]) for 0 <= i < N represents a unique point (x, y) in a 2-D Cartesian plane.
 * Find and return the number of unordered quadruplet (i, j, k, l)
 * such that (A[i], B[i]), (A[j], B[j]), (A[k], B[k]) and (A[l], B[l])
 * form a rectangle with the rectangle having all the sides parallel to either x-axis or y-axis.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 2000
 * 0 <= A[i], B[i] <= 109
 * <p>
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer array B.
 * <p>
 * Output Format
 * Return the number of unordered quadruplets that form a rectangle.
 */

public class CountRectangles {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int res = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            map.put(A.get(i) + "" + B.get(i), map.getOrDefault(A.get(i) + "" + B.get(i), 0) + 1);
        }
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < B.size(); j++) {
                if (!A.get(i).equals(A.get(j)) && !B.get(i).equals(B.get(j))) {
                    if (map.containsKey(A.get(i) + "" + B.get(j)) && map.get(A.get(i) + "" + B.get(j)) == 1 &&
                            map.containsKey(A.get(j) + "" + B.get(i)) && map.get(A.get(j) + "" + B.get(i)) == 1) {
                        res++;
                    }
                }
            }
        }
        return res / 2;
    }
}
