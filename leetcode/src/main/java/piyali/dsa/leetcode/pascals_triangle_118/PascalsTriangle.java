package piyali.dsa.leetcode.pascals_triangle_118;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row, pre = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(Objects.requireNonNull(pre).get(j - 1) + pre.get(j));
            pre = row;
            res.add(row);
        }
        return res;
    }
}
