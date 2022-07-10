package piyali.dsa.scaler.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticProgression {
    public int solve(ArrayList<Integer> A) {
        if (A == null || A.size() == 0)
            return 0;
        if (A.size() == 1)
            return 1;
        Collections.sort(A);
        int progression = A.get(1) - A.get(0);
        boolean isAP = true;
        for (int i = 1; i < A.size() - 1; ++i) {
            if (A.get(i + 1) - A.get(i) != progression) {
                isAP = false;
                break;
            }
        }
        return isAP ? 1 : 0;
    }
}
