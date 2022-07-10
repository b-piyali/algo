package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PairsWithGivenXor {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : A) {
            int xOr = num ^ B;
            if (numSet.contains(xOr)) {
                count++;
            } else {
                numSet.add(num);
            }
        }
        return count;
    }

}
