package piyali.dsa.leetcode.reverse_linked_list_206;

import piyali.dsa.leetcode.linked_list.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode outPutNode = null;
        while (head != null) {
            ListNode nextElement = head.next;
            head.next = outPutNode;
            outPutNode = head;
            head = nextElement;
        }

        return outPutNode;
    }
}
