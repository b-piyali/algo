package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class LeftViewBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
        if (Objects.isNull(A))
            return new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        queue.add(null);
        result.add(A.val);

        while (queue.size() > 1) {
            TreeNode node = queue.poll();
            if (Objects.isNull(node)) {
                queue.add(null);
                result.add(queue.peek().val);
            } else {
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
        return result;
    }
}
