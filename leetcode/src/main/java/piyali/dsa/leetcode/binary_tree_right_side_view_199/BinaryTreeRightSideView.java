package piyali.dsa.leetcode.binary_tree_right_side_view_199;

import piyali.dsa.leetcode.tree.TreeNode;

import java.util.*;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (Objects.isNull(root))
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

                if (i == size - 1)
                    result.add(node.val);
            }
        }
        return result;
    }
}
