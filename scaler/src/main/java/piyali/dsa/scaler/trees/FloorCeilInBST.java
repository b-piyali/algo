package piyali.dsa.scaler.trees;

import java.util.ArrayList;
import java.util.List;

public class FloorCeilInBST {
    public ArrayList<ArrayList<Integer>> solve(TreeNode A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int X : B) {
            ArrayList<Integer> temp = floorAndCeil(A, X);
            ans.add(temp);
        }
        return ans;
    }

    public ArrayList<Integer> floorAndCeil(TreeNode A, int X) {
        int floor = -1;
        int ceil = -1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (null != A) {
            if (A.val == X) {
                ans.add(A.val);
                ans.add(A.val);
                return ans;
            }
            if (A.val > X) {
                ceil = A.val;
                A = A.left;
            } else {
                floor = A.val;
                A = A.right;
            }
        }
        ans.add(floor);
        ans.add(ceil);
        return ans;
    }
}
