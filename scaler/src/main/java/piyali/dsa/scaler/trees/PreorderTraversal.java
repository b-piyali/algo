package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.Objects;

public class PreorderTraversal {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderTraversal(A, result);
        return result;
    }

    private void preorderTraversal(TreeNode root, ArrayList<Integer> result) {
        if(Objects.isNull(root))
            return;

        result.add(root.val);
        preorderTraversal(root.left, result);
        preorderTraversal(root.right, result);
    }
}
