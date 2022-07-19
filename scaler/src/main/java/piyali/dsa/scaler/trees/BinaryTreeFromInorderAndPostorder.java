package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.Objects;

public class BinaryTreeFromInorderAndPostorder {
    private static int index;

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null || A.size() != B.size()) {
            return null;
        }
        index = A.size() - 1;
        return buildTree(A, B, 0, B.size() - 1);
    }

    private TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder, int left, int right) {
        if (index < 0 || left > right) {
            return null;
        }

        TreeNode root = new TreeNode(postorder.get(index));
        for (int i = left; i <= right; i++) {
            if (Objects.equals(postorder.get(index), inorder.get(i))) {
                index--;
                root.left = buildTree(inorder, postorder, left, i - 1);
                root.right = buildTree(inorder, postorder, i + 1, right);
                break;
            }
        }
        return root;
    }
}
