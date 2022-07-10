package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * Given two integer arrays, A and B of size N and M, respectively.
 * Your task is to find all the common elements in both the array.
 * <p>
 * NOTE:
 * Each element in the result should appear as many times as it appears in both arrays.
 * The result can be in any order.
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 105
 * 1 <= A[i] <= 109
 * <p>
 * Input Format
 * First argument is an integer array A of size N.
 * Second argument is an integer array B of size M.
 * <p>
 * Output Format
 * Return an integer array denoting the common elements.
 */

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : A) {
            frequency.merge(num, 1, Integer::sum);
        }

        ArrayList<Integer> output = new ArrayList<>();
        for (int num : B) {
            if (frequency.containsKey(num) && frequency.get(num) > 0) {
                frequency.merge(num, -1, Integer::sum);
                output.add(num);
            }
        }
        return output;
    }
}
