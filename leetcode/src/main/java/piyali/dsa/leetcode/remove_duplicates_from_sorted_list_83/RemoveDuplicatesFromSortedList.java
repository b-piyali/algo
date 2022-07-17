package piyali.dsa.leetcode.remove_duplicates_from_sorted_list_83;

import piyali.dsa.leetcode.linked_list.ListNode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode prev = head;
        ListNode cur = prev.next;
        while (cur != null) {
            if (cur.val == prev.val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
