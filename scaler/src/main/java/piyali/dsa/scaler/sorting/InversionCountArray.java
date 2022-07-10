package piyali.dsa.scaler.sorting;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A.
 * Find the total number of inversions of A modulo (109 + 7).
 * <p>
 * Problem Constraints
 * 1 <= length of the array <= 100000
 * 1 <= A[i] <= 10^9
 * <p>
 * Input Format
 * The only argument given is the integer array A.
 * <p>
 * Output Format
 * Return the number of inversions of A modulo (109 + 7).
 */

public class InversionCountArray {
    int mod = (int) Math.pow(10, 9) + 7;
    int count = 0;

    public int solve(ArrayList<Integer> A) {
        mergeSort(A, 0, A.size() - 1);
        return count;
    }

    private void mergeSort(ArrayList<Integer> arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    /* private void merge(ArrayList<Integer> arr, int start, int mid, int end) {
         ArrayList<Integer> left = new ArrayList<>(Arrays.copyOfRange(arr, start, mid + 1));
         ArrayList<Integer> right = Arrays.copyOfRange(arr, mid + 1, end + 1);
         int ptr1 = 0, ptr2 = 0, index = start; // COMMON MISTAKE : index =0 , this will fail for input : 45 10 15 25 50
         while (ptr1 < left.size() && ptr2 < right.size()) {
             if (left.get(ptr1) <= right.get(ptr2)) {
                 arr.set(index, left.get(ptr1));
                 ptr1++;
             } else {
 //System.out.println(count +":"+ left[ptr1] +":"+ right[ptr2]);
                 arr.set(index, right.get(ptr2));
                 count = (count + (left.size() - ptr1)) % mod; // COMMON MISTAKE : mid-ptr1
                 ptr2++;
             }
             index++;
         }

         while (ptr1 < left.size()) {
             arr.set(index, left.get(ptr1));
             index++;
             ptr1++;
         }

         while (ptr2 < right.size()) {
             arr.set(index, right.get(ptr2));
             ptr2++;
             index++;
         }
     }*/
    private void merge(ArrayList<Integer> A, int start, int mid, int end) {
        ArrayList<Integer> tempList = new ArrayList<>();
        int p1 = start;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= end) {
            if (A.get(p1) <= A.get(p2)) {
                tempList.add(A.get(p1));
                p1++;
            } else {
                tempList.add(A.get(p2));
                count = (count + (tempList.size() - p1)) % mod;
                p2++;
            }
        }
        while (p1 <= mid) {
            tempList.add(A.get(p1));
            p1++;
        }
        while (p2 <= end) {
            tempList.add(A.get(p2));
            p2++;
        }
        for (int i = 0; i < tempList.size(); i++) {
            A.set((i + start), tempList.get(i));
        }
    }
}
