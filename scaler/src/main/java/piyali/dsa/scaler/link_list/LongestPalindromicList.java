package piyali.dsa.scaler.link_list;

/**
 * Problem Description
 * Given a linked list of integers. Find and return the length of the longest palindrome list that exists in that linked list.
 * A palindrome list is a list that reads the same backward and forward.
 * Expected memory complexity : O(1)
 * <p>
 * Problem Constraints
 * 1 <= length of the linked list <= 2000
 * 1 <= Node value <= 100
 * <p>
 * Input Format
 * The only argument given is head pointer of the linked list.
 * <p>
 * Output Format
 * Return the length of the longest palindrome list.
 * <p>
 * Example Input
 * Input 1:
 * 2 -> 3 -> 3 -> 3
 * <p>
 * Input 2:
 * 2 -> 1 -> 2 -> 1 ->  2 -> 2 -> 1 -> 3 -> 2 -> 2
 * <p>
 * Example Output
 * Output 1:
 * 3
 * <p>
 * Output 2:
 * 5
 * <p>
 * Example Explanation
 * Explanation 1:
 * 3 -> 3 -> 3 is largest palindromic sublist
 * <p>
 * Explanation 2:
 * 2 -> 1 -> 2 -> 1 -> 2 is largest palindromic sublist.
 */

public class LongestPalindromicList {
    public int solve(ListNode A) {
        return longestPalindrome(A);
    }

    public int longestPalindrome(ListNode head) {
        int maxLen = 1;
        ListNode center = head;
        ListNode prev = null;
        //odd sublist manipulation
        while (center != null) {
            int len = 1;
            ListNode right = center.next;
            ListNode t1 = prev;
            ListNode t2 = right;
            while (t1 != null && t2 != null) {
                if (t1.val == t2.val) {
                    t1 = t1.next;
                    t2 = t2.next;
                    len += 2;
                    continue;
                }
                break;
            }
            maxLen = Math.max(len, maxLen);
            center.next = prev;
            prev = center;
            center = right;
        }
        //Even Length
        ListNode h = prev;
        prev = null;
        center = h;
        while (center != null && center.next != null) {
            ListNode right = center.next;
            if (center.val == right.val) {
                int len = 2;
                ListNode next = right.next;
                ListNode t1 = prev;
                ListNode t2 = next;
                while (t1 != null && t2 != null) {
                    if (t1.val == t2.val) {
                        len += 2;
                        t1 = t1.next;
                        t2 = t2.next;
                        continue;
                    }
                    break;
                }
                maxLen = Math.max(len, maxLen);
            }
            center.next = prev;
            prev = center;
            center = right;
        }

        return maxLen;
    }
}
