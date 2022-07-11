package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.Objects;

public class PostorderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> postOrderList = new ArrayList<>();
        postorderTraversal(A, postOrderList);
        return postOrderList;
    }

    private void postorderTraversal(TreeNode root, ArrayList<Integer> postOrderList) {
        if (Objects.isNull(root))
            return;

        postorderTraversal(root.left, postOrderList);
        postorderTraversal(root.right, postOrderList);
        postOrderList.add(root.val);
    }
}
