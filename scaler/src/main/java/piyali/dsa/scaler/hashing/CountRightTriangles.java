package piyali.dsa.scaler.hashing;

import java.util.HashMap;

public class CountRightTriangles {
    public int solve(int[] A, int[] B) {
        long m = 1000000007;
        HashMap<Integer, Integer> mapX = new HashMap<>();
        HashMap<Integer, Integer> mapY = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            mapX.put(A[i], mapX.getOrDefault(A[i], 0) + 1);
            mapY.put(B[i], mapY.getOrDefault(B[i], 0) + 1);
        }
        int res = 0;
        for (int i = 0; i < B.length; i++) {
            res = (int) ((res + ((long) (mapX.get(A[i]) - 1) * (mapY.get(B[i]) - 1)) % m) % m);
        }
        return res;
    }
}
