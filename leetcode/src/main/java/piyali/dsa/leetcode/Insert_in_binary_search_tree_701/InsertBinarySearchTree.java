package piyali.dsa.leetcode.Insert_in_binary_search_tree_701;

import piyali.dsa.leetcode.tree.TreeNode;

public class InsertBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        else if (val > root.val)
            root.right = insertIntoBST(root.right, val);
        return root;
    }
}
