package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = B - A.get(i);
            if (m.containsKey(val)) {
                ans.add(m.get(val) + 1);
                ans.add(i + 1);
                break;
            } else if (!m.containsKey(A.get(i))) {
                m.put(A.get(i), i);
            }
        }

        return ans;
    }
}
