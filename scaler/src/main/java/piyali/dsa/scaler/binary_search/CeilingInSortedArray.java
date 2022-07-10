package piyali.dsa.scaler.binary_search;

import java.util.ArrayList;

public class CeilingInSortedArray {
    public int solve(int A, ArrayList<Integer> B, int C) {
        int low = 0;
        int high = A;
        int ans = -1;
        while ( low < high) {
            int mid = (low + high) / 2;
            if (B.get(mid) < C) {
                low = mid + 1;
            } else if (B.get(mid) >= C){
                ans = B.get(mid);
                high = mid;
            }
        }
        return ans;
    }
}
