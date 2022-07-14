package piyali.dsa.scaler.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class NQueens {

    public ArrayList<ArrayList<String>> solveNQueens(int A) {
        ArrayList<String> list = new ArrayList<>(Collections.nCopies(A, "."));
        ArrayList<ArrayList<String>> board = new ArrayList<>(Collections.nCopies(A, list));
        solveNQueens(board, A, 0);
        return board;
    }

    private void solveNQueens(ArrayList<ArrayList<String>> board, int len, int row) {

    }


}
