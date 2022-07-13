package piyali.dsa.scaler.trees;

import java.util.ArrayList;

public class TopViewBinaryTree {
    ArrayList<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> solve(TreeNode A) {
        if (A == null) {
            return ans;
        }
        ans.add(A.val);
        leftSubTree(A);
        rightSubTree(A);
        return ans;
    }

    private void leftSubTree(TreeNode A) {
        while (A.left != null) {
            A = A.left;
            ans.add(A.val);
        }
    }

    private void rightSubTree(TreeNode A) {
        while (A.right != null) {
            A = A.right;
            ans.add(A.val);
        }
    }
}
