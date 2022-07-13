package piyali.dsa.leetcode.validsudoku_36;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> sudokuVals = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    String row = "Row" + i + j;
                    String col = "Col" + i + j;
                    String box = "Box" + i / 3 + j / 3;
                    if (sudokuVals.contains(row) ||
                            sudokuVals.contains(col) ||
                            sudokuVals.contains(box)) {
                        return false;
                    }
                    sudokuVals.add(row);
                    sudokuVals.add(col);
                    sudokuVals.add(box);
                }
            }
        }
        return true;
    }
}
