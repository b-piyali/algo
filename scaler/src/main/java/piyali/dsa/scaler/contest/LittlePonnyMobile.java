package piyali.dsa.scaler.contest;

import java.util.ArrayList;
import java.util.Collections;

public class LittlePonnyMobile {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> countList = new ArrayList<>();
        Collections.sort(A);
        for (int amount : B) {
            int count = 0;
            int i = 0;
            while (amount > 0 && i < A.size()) {
                amount -= A.get(i);
                count++;
                i++;
            }
            if (amount < 0)
                count--;
            countList.add(count);
        }
        return countList;
    }
}
