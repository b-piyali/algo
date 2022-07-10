package piyali.dsa.scaler.binary_search;

public class AthMagicalNumber {
    private int gcd(int x, int y) {
        if (x == 0) {
            return y;
        }
        return gcd(y % x, x);
    }

    public int solve(int A, int B, int C) {
        long lcm = (long) B * C / gcd(B, C);
        long low = Math.min(B, C), high = (long) Math.min(B, C) * A, ans = 2;
        while (low <= high) {
            long mid = low + ((high - low) / 2);
            long cntb = mid / B;
            long cntc = mid / C;
            long cntbc = mid / lcm;

            if (cntb + cntc - cntbc >= A) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) (ans % 1000000007);
    }
}
