package piyali.dsa.scaler.hashing;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
 * If the answer does not exist return an array with a single element "-1".
 * First sub-array means the sub-array for which starting index in minimum.
 * <p>
 * Problem Constraints
 * 1 <= length of the array <= 100000
 * 1 <= A[i] <= 109
 * 1 <= B <= 109
 * <p>
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is integer B.
 * <p>
 * Output Format
 * Return the first continuous sub-array which adds to B and if the answer does not exist
 * return an array with a single element "-1".
 */

public class SubarrayWithGivenSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> subArray = new ArrayList<>();
        int len = A.size();
        int sum = A.get(0);
        int start = 0;
        for (int i = 1; i < len; i++) {
            if (B == A.get(i)) {
                subArray.add(A.get(i));
                break;
            }

            while (sum > B && start < i - 1) {
                sum -= A.get(start);
                ++start;
            }

            if (sum == B) {
                for (int j = start; j < i; j++) {
                    subArray.add(A.get(j));
                }
                break;
            }

            sum += A.get(i);
        }
        if (subArray.size() == 0) {
            subArray.add(-1);
        }
        return subArray;
    }
}
