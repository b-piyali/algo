package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BSTNodesInRange {
    private static List<TreeNode> nodes;

    public int solve(TreeNode A, int B, int C) {
        nodes = new ArrayList<>();
        if (Objects.isNull(A))
            return 0;
        inorder(A, B, C);
        return nodes.size();
    }

    private void inorder(TreeNode node, int start, int end) {
        if (Objects.isNull(node))
            return;
        inorder(node.left, start, end);
        if (node.val >= start && node.val <= end) {
            nodes.add(node);
        }
        inorder(node.right, start, end);
    }
}
