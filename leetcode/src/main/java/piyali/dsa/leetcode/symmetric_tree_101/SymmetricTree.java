package piyali.dsa.leetcode.symmetric_tree_101;

import piyali.dsa.leetcode.tree.TreeNode;

import java.util.Objects;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (Objects.isNull(root))
            return false;
        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(TreeNode left, TreeNode right) {
        if (Objects.isNull(left) && Objects.isNull(right))
            return true;
        if (Objects.isNull(left) || Objects.isNull(right))
            return false;

        return (left.val == right.val) &&
                checkSymmetric(left.left, right.right) &&
                checkSymmetric(left.right, right.left);
    }
}
