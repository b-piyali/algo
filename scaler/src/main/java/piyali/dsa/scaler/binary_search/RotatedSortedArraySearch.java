package piyali.dsa.scaler.binary_search;

import java.util.List;

public class RotatedSortedArraySearch {
    public int search(final List<Integer> A, int B) {
        int l = 0;
        int r = A.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (A.get(0) > B) {
                if (A.get(mid) == B) {
                    return mid;
                } else if (A.get(mid) > B && A.get(mid) < A.get(A.size() - 1)) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (A.get(0) < B) {
                if (A.get(mid) > A.get(0)) {
                    if (A.get(mid) > B) {
                        r = mid - 1;
                    } else if (A.get(mid) < B) {
                        l = mid + 1;
                    } else {
                        return mid;
                    }
                } else {
                    r = mid - 1;
                }
            } else {
                return 0;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = Pivot(nums);
        int ans = BinarySearch(nums, target, 0, pivot);
        if (ans == -1)
            ans = BinarySearch(nums, target, pivot + 1, nums.length - 1);
        return ans;
    }

    public int Pivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid - 1] > arr[mid])
                return mid - 1;
            if (arr[mid] > arr[start])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public int BinarySearch(int[] arr, int target, int start, int end) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return ans;
    }
}
