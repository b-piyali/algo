package piyali.dsa.scaler.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem Description
 * N children are standing in a line. Each child is assigned a rating value.
 * You are giving candies to these children subjected to the following requirements:
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * What is the minimum number of candies you must give?
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * -109 <= A[i] <= 109
 * <p>
 * Input Format
 * The first and only argument is an integer array A representing the rating of children.
 * <p>
 * Output Format
 * Return an integer representing the minimum candies to be given.
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2]
 * <p>
 * Input 2:
 * A = [1, 5, 2, 1]
 * <p>
 * Example Output
 * Output 1:
 * 3
 * <p>
 * Output 2:
 * 7
 * <p>
 * Example Explanation
 * Explanation 1:
 * The candidate with 1 rating gets 1 candy and candidate with rating 2
 * cannot get 1 candy as 1 is its neighbor.  So rating 2 candidate gets 2 candies.
 * In total, 2 + 1 = 3 candies need to be given out.
 * <p>
 * Explanation 2:
 * Candies given = [1, 3, 2, 1]
 */

public class DistributeCandy {
    public int candy(ArrayList<Integer> A) {
        if (A == null || A.size() == 0) {
            return 0;
        }
        int len = A.size();
        //Initially allocate each child 1 candy
        List<Integer> candies = new ArrayList<>(Collections.nCopies(len, 1));

        //From Left to right :  if child to right has higher rating
        // then give right child 1 candy extra than no. of candies to left child
        for (int i = 1; i < len; i++) {
            if (A.get(i) > A.get(i - 1)) {
                candies.set(i, candies.get(i - 1) + 1);
            }
        }

        //From right to left :  if child to left has higher rating
        // then give left child 1 candy extra than no. of candies to right child
        for (int i = len - 2; i >= 0; i--) {
            if (A.get(i) > A.get(i + 1)) {
                candies.set(i, Math.max(candies.get(i), candies.get(i + 1) + 1));
            }
        }

        int sum = 0;
        for (int candy : candies)
            sum += candy;

        return sum;
    }
}
