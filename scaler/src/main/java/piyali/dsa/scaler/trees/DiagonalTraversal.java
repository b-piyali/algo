package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonalTraversal {
    Map<Integer, List<Integer>> hashmap = new HashMap<>();

    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrder(A, 0);

        for (List<Integer> val : hashmap.values()) {
            result.addAll(val);
        }
        return result;
    }

    private void preOrder(TreeNode A, int index) {
        if (A == null)
            return;
        List<Integer> temp;
        if (hashmap.containsKey(index)) {
            temp = hashmap.get(index);
        } else {
            temp = new ArrayList<>();
        }

        temp.add(A.val);
        hashmap.put(index, temp);
        if (A.left != null) {
            preOrder(A.left, index + 1);
        }
        if (A.right != null) {
            preOrder(A.right, index);
        }

    }
}
