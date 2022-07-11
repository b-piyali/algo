package piyali.dsa.scaler.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem Description
 * Given an integer A, you have to find the Ath Perfect Number.
 * A Perfect Number has the following properties:
 * It comprises only 1 and 2.
 * The number of digits in a Perfect number is even.
 * It is a palindrome number.
 * <p>
 * For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.
 * <p>
 * Problem Constraints
 * 1 <= A <= 100000
 * <p>
 * Input Format
 * The only argument given is an integer A.
 * <p>
 * Output Format
 * Return a string that denotes the Ath Perfect Number.
 * <p>
 * Example Input
 * Input 1:
 * A = 2
 * <p>
 * Input 2:
 * A = 3
 * <p>
 * Example Output
 * Output 1:
 * 22
 * <p>
 * Output 2:
 * 1111
 * <p>
 * Example Explanation
 * Explanation 1:
 * First four perfect numbers are:
 * 1. 11
 * 2. 22
 * 3. 1111
 * 4. 1221
 * <p>
 * Explanation 2:
 * First four perfect numbers are:
 * 1. 11
 * 2. 22
 * 3. 1111
 * 4. 1221
 */

public class PerfectNumbers {
    public String solve(int A) {
        int count = 0;
        Queue<Long> queue = new LinkedList<>();
        if (A == 1) {
            return "11";
        }
        if (A == 2) {
            return "22";
        }
        count += 2;
        queue.add(1L);
        queue.add(2L);
        while (count <= A) {
            long x = queue.poll();
            x = x * 10;
            queue.add(x + 1);
            queue.add(x + 2);
            count += 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(queue.poll());

        return sb + (sb.reverse()).toString();
    }
}
