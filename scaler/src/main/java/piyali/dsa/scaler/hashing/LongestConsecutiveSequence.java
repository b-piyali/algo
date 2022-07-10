package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestConsecutiveSequence {
    public int longestConsecutive(final List<Integer> A) {
        List<Integer> nums = new ArrayList<>(A);
        if (A.size() == 1)
            return 1;
        Collections.sort(nums);
        int max = 0;
        int count = 1;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i + 1) - nums.get(i) == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }

        return max;
    }
}
