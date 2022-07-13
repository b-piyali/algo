package piyali.dsa.scaler.trees;

public class ValidBinarySearchTree {
    private TreeNode prev = null;

    public int isValidBST(TreeNode A) {
        if (A == null) {
            return 1;
        }
        if (isValidBST(A.left) == 0) {
            return 0;
        }
        if (prev != null && prev.val >= A.val) {
            return 0;
        } else {
            prev = A;
        }
        if (isValidBST(A.right) == 0) {
            return 0;
        }
        return 1;
    }
}
