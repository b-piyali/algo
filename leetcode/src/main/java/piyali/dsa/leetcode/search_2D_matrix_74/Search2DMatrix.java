package piyali.dsa.leetcode.search_2D_matrix_74;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int i = 0;
        int j = colLen - 1;
        while (i < rowLen && j >= 0) {
            if (matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
