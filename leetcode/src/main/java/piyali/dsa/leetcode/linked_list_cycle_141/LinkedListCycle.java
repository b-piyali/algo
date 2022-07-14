package piyali.dsa.leetcode.linked_list_cycle_141;

import piyali.dsa.leetcode.linked_list.ListNode;

import java.util.Objects;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (Objects.isNull(head)) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (Objects.equals(fast, slow)) {
                return true;
            }
        }
        return false;
    }
}
