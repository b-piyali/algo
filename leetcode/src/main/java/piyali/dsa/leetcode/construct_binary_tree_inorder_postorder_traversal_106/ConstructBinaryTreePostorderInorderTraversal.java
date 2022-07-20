package piyali.dsa.leetcode.construct_binary_tree_inorder_postorder_traversal_106;

import piyali.dsa.leetcode.tree.TreeNode;

public class ConstructBinaryTreePostorderInorderTraversal {
    private static int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }
        index = postorder.length - 1;
        return buildTree(inorder, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int left, int right) {
        if (index < 0 || left > right) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[index]);

        for (int i = left; i <= right; i++) {
            if (postorder[index] == inorder[i]) {
                index--;
                root.right = buildTree(inorder, postorder, i + 1, right);
                root.left = buildTree(inorder, postorder, left, i - 1);
                break;
            }
        }
        return root;
    }
}
