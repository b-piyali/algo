package piyali.dsa.scaler.two_pointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Problem Description
 * Given an array A of N integers, are there elements a, b, c in S such that a + b + c = 0
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 * <p>
 * Problem Constraints
 * 0 <= N <= 7000
 * -108 <= A[i] <= 108
 * <p>
 * Input Format
 * Single argument representing a 1-D array A.
 * <p>
 * Output Format
 * Output a 2-D vector where each row represent a unique triplet.
 */
public class SumZero3 {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        int n = A.size();
        for (int i = 0; i < n - 2; i++) {
            int a = A.get(i);
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int b = A.get(j);
                int c = A.get(k);
                int pairSum = b + c;
                if (pairSum == -a) {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(a);
                    list.add(b);
                    list.add(c);
                    lists.add(list);
                    j++;
                    k--;
                } else if (pairSum > -a) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        //Remove duplicate triplets
        Set<ArrayList<Integer>> set = new LinkedHashSet<ArrayList<Integer>>(lists);
        lists.clear();
        lists.addAll(set);
        return lists;
    }
}
