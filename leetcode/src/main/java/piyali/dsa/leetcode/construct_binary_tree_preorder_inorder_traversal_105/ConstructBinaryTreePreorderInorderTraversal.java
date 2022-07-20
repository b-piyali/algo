package piyali.dsa.leetcode.construct_binary_tree_preorder_inorder_traversal_105;

import piyali.dsa.leetcode.tree.TreeNode;

public class ConstructBinaryTreePreorderInorderTraversal {
    private int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }
        return buildTree(preorder, inorder, 0, preorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int left, int right) {
        if (index == preorder.length || left > right) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[index]);
        for (int i = left; i <= right; i++) {
            if (preorder[index] == inorder[i]) {
                index++;
                root.left = buildTree(preorder, inorder, left, i - 1);
                root.right = buildTree(preorder, inorder, i + 1, right);
                break;
            }
        }
        return root;
    }
}
