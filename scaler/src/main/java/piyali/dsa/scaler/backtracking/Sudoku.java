package piyali.dsa.scaler.backtracking;

import java.util.ArrayList;

public class Sudoku {
    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
        if (a == null || a.size() == 0) return;
        int x = a.size() * a.get(0).size();
        int r = x / 9;
        int c = x % 9;
        if (a.get(r).get(c) != null) {
            solveSudoku(a);
        } else {
            for (int i = 1; i <= 9; i++) {
                //if (valid(a, r, c, i)) {
                    char ch = (char) i;
                    a.get(r).set(c, ch);

                //}
            }
        }
    }
}
