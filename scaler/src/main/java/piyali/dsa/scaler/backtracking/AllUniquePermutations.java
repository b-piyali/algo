package piyali.dsa.scaler.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AllUniquePermutations {
    Set<ArrayList<Integer>> result = new HashSet<>();

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        if (Objects.isNull(A))
            return new ArrayList<>();
        permute(A, A.size(), 0);
        return new ArrayList<>(result);
    }

    private void permute(ArrayList<Integer> list, int size, int index) {
        if (index == size - 1) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < size; i++) {
            swap(list, index, i);
            permute(list, size, index + 1);
            swap(list, index, i);
        }
    }

    private void swap(ArrayList<Integer> list, int start, int end) {
        int temp = list.get(end);
        list.set(end, list.get(start));
        list.set(start, temp);
    }
}
