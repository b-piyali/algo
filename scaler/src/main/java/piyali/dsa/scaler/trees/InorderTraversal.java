package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.Objects;

public class InorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversal(A, result);
        return result;
    }

    private void inorderTraversal(TreeNode root, ArrayList<Integer> result) {
        if(Objects.isNull(root))
            return;

        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}
