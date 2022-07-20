package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.List;

public class CheckBSTWithOneChild {
    public String solve(ArrayList<Integer> A) {
        return verify(A, 0, Integer.MIN_VALUE, Integer.MAX_VALUE) ? "YES" : "NO";
    }

    private boolean verify(List<Integer> nodes, int start, int minValue, int maxValue) {
        if (start == nodes.size()) {
            return true;
        }
        if (nodes.get(start) >= minValue && nodes.get(start) <= maxValue) {
            int val = nodes.get(start);
            return verify(nodes, start + 1, minValue, val - 1) ||
                    verify(nodes, start + 1, val + 1, maxValue);
        }
        return false;
    }
}
