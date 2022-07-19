package piyali.dsa.scaler.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSumII {
    ArrayList<ArrayList<Integer>> ans;

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ans = new ArrayList<>();
        Collections.sort(A);
        ArrayList<Integer> list = new ArrayList<>();
        backtrack(list, A, B, 0, 0);
        return ans;
    }

    private void backtrack(ArrayList<Integer> list, ArrayList<Integer> A, int B, int i, int sum) {
        if (i == A.size()) {
            if (sum == B && !ans.contains(list)) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        sum += A.get(i);
        list.add(A.get(i));
        backtrack(list, A, B, i + 1, sum);
        sum -= A.get(i);
        list.remove(list.size() - 1);
        backtrack(list, A, B, i + 1, sum);
    }
}
