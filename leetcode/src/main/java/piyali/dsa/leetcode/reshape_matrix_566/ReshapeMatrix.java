package piyali.dsa.leetcode.reshape_matrix_566;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int column = mat[0].length;
        if (row * column == r * c) {
            int[][] ans = new int[r][c];
            for (int i = 0; i < row * column; i++) {
                ans[i / c][i % c] = mat[i / column][i % column];
            }
            return ans;
        } else {
            return mat;
        }
    }
}
