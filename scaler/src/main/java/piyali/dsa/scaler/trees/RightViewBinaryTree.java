package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class RightViewBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
        if (Objects.isNull(A))
            return new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        //queue.add(null);
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
