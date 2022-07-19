package piyali.dsa.scaler.trees;

import java.util.ArrayList;

public class PrintAllRootLeafPaths {
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        if (A == null)
            return new ArrayList<>();

        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<ArrayList<Integer>> left_subtree = solve(A.left);
        ArrayList<ArrayList<Integer>> right_subtree = solve(A.right);

        addSubTree(A, paths, left_subtree);
        addSubTree(A, paths, right_subtree);

        if (paths.size() == 0) {
            paths.add(new ArrayList<>());
            paths.get(0).add(A.val);
        }

        return paths;
    }

    private void addSubTree(TreeNode A, ArrayList<ArrayList<Integer>> paths, ArrayList<ArrayList<Integer>> left_subtree) {
        for (ArrayList<Integer> integers : left_subtree) {
            ArrayList<Integer> new_path = new ArrayList<>();
            new_path.add(A.val);
            new_path.addAll(integers);
            paths.add(new_path);
        }
    }
}
