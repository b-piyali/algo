package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * You are given an array of N integers, A1, A2 ,…, AN and an integer B.
 * Return the of count of distinct numbers in all windows of size B.
 * Formally, return an array of size N-B+1 where i'th element in this array contains
 * number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
 * <p>
 * NOTE: if B > N, return an empty array.
 * <p>
 * Input Format
 * First argument is an integer array A
 * Second argument is an integer B.
 * <p>
 * Output Format
 * Return an integer array.
 */

public class DistinctNumbersWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < B; i++) {
            freqMap.merge(A.get(i), 1, Integer::sum);
        }
        ans.add(freqMap.size());
        int len = A.size() - B;
        for (int i = B; i < A.size(); ++i) {
            int preIndex = i - B;
            int preVal = A.get(preIndex);
            freqMap.merge(preVal, -1, Integer::sum);
            freqMap.merge(A.get(i), 1, Integer::sum);
            if (freqMap.get(preVal) == 0) {
                freqMap.remove(preVal);
            }
            ans.add(freqMap.size());
        }
        return ans;
    }
}
