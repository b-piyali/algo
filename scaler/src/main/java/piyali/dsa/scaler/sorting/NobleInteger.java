package piyali.dsa.scaler.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        if (A == null)
            return -1;
        A.sort(Collections.reverseOrder());
        int count = 0;
        if (A.get(0) == 0)
            return 1;
        for (int i = 1; i < A.size(); ++i) {
            if (!Objects.equals(A.get(i), A.get(i - 1))) {
                count = i;
            }
            if (count == A.get(i))
                return 1;
        }
        return -1;
    }
}
