package piyali.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IsDictionary {
    public int solve(ArrayList<String> A, String B) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < B.length(); ++i) {
            wordMap.put(B.charAt(i), i);
        }
        for (int i = 1; i < A.size(); i++) {
            if (!isSorted(A.get(i - 1), A.get(i), wordMap)) {
                return 0;
            }
        }
        return 1;
    }

    private boolean isSorted(String firstString, String secondString, Map<Character, Integer> wordMap) {
        int l1 = firstString.length();
        int l2 = secondString.length();
        int i = 0;
        int j = 0;

        while (i < l1 && j < l2) {
            if (firstString.charAt(i) != secondString.charAt(j)) {
                if (wordMap.get(firstString.charAt(i)) > wordMap.get(secondString.charAt(j))) {
                    return false;
                } else {
                    return true;
                }
            }
            ++i;
            ++j;
        }

        if (l1 > l2)
            return false;

        return true;
    }
}
