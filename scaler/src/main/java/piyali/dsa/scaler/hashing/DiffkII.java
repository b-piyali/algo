package piyali.dsa.scaler.hashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffkII {
    public int diffPossible(final List<Integer> A, int B) {
        Set<Integer> newValues = new HashSet<>();
        for (int nums : A) {
            if (newValues.contains(nums - B) || newValues.contains(nums + B)) {
                return 1;
            } else {
                newValues.add(nums);
            }
        }
        return 0;
    }
}
