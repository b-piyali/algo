package piyali.dsa.leetcode.binary_tree_level_order_traversal_102;

import piyali.dsa.leetcode.tree.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (Objects.isNull(root))
            return new ArrayList<>();

        List<List<Integer>> levelOrder = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        List<Integer> levelList = new ArrayList<>();

        while (queue.size() > 0) {
            TreeNode node = queue.remove();
            if (Objects.isNull(node) && queue.size() > 0) {
                levelOrder.add(levelList);
                levelList = new ArrayList<>();
                queue.add(null);
            } else if (Objects.nonNull(node)){
                levelList.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
        levelOrder.add(levelList);

        return levelOrder;
    }
}
