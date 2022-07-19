package piyali.dsa.leetcode.maximum_depth_binary_tree_104;

import piyali.dsa.leetcode.tree.TreeNode;

import java.util.Objects;

public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (Objects.isNull(root))
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
