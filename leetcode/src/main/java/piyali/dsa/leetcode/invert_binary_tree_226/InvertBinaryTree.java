package piyali.dsa.leetcode.invert_binary_tree_226;

import piyali.dsa.leetcode.tree.TreeNode;

import java.util.Objects;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (Objects.isNull(root))
            return null;

        swap(root);

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        return root;
    }

    private void swap(TreeNode root) {
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
    }
}
