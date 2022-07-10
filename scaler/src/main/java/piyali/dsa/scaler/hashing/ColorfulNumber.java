package piyali.dsa.scaler.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Description
 * Given a number A, find if it is COLORFUL number or not.
 * If number A is a COLORFUL number return 1 else, return 0.
 * What is a COLORFUL Number:
 * A number can be broken into different contiguous sub-subsequence parts.
 * Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
 * And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.
 * <p>
 * Problem Constraints
 * 1 <= A <= 2 * 109
 * <p>
 * Input Format
 * The first and only argument is an integer A.
 * <p>
 * Output Format
 * Return 1 if integer A is COLORFUL else return 0.
 */

public class ColorfulNumber {
    public int colorful(int A) {
        Set<Integer> set = new HashSet<>();
        int prev = -1;
        int n = 10;
        while (A > 0) {
            int currDigit = A % n;
            A = A / n;
            if (set.contains(currDigit) || set.contains(currDigit * prev))
                return 0;
            set.add(currDigit);
            if (!set.add(currDigit * prev)) {
                return 0;
            }
            prev = currDigit;
        }
        return 1;
    }
}
