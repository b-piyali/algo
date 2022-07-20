package piyali.dsa.leetcode.search_in_binary_search_tree_700;

import piyali.dsa.leetcode.tree.TreeNode;

import java.util.Objects;

public class SearchBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        if (val < root.val)
            return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
}
