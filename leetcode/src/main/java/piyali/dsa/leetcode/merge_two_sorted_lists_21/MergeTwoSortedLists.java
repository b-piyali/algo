package piyali.dsa.leetcode.merge_two_sorted_lists_21;

import piyali.dsa.leetcode.linked_list.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        while (list1 != null) {
            result.next = list1;
            list1 = list1.next;
            result = result.next;
        }
        while (list2 != null) {
            result.next = list2;
            list2 = list2.next;
            result = result.next;
        }
        return dummy.next;
    }
}
