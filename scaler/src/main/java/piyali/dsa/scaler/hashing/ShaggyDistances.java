package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShaggyDistances {
    public int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            int val = A.get(i);
            if (nums.containsKey(val)) {
                min = Math.min(min, (i - nums.get(val)));
            }
            nums.put(val, i);
        }
        return min != Integer.MAX_VALUE ? min : -1;
    }
}
