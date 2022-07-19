package piyali.dsa.scaler.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subset {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        int size = A.size();
        int totalBinary = (int) Math.pow(2, size);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < totalBinary; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < A.size(); j++) {
                if (checkSetBit(i, j))
                    temp.add(A.get(j));
            }
            result.add(temp);
        }
        sort(result);
        return result;
    }

    private void sort(ArrayList<ArrayList<Integer>> result) {
        result.sort((List<Integer> a, List<Integer> b) -> {
            for (int i = 0; i < a.size() && i < b.size(); i++) {
                if (a.get(i) < b.get(i))
                    return -1;
                if (a.get(i) > b.get(i))
                    return 1;
            }
            if (a.size() > b.size())
                return 1;

            return -1;
        });
    }

    private boolean checkSetBit(int num, int bitPos) {
        return ((num >> bitPos) & 1) == 1;
    }
}
