package piyali.dsa.leetcode.palindrome_linked_list_234;

import piyali.dsa.leetcode.linked_list.ListNode;

import java.util.Objects;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode temp = secondHead;

        while (Objects.nonNull(head) && Objects.nonNull(secondHead)) {
            if (head.val != secondHead.val) {
                break; // not a palindrome
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseList(temp);
        return Objects.isNull(head) || Objects.isNull(secondHead);
    }

    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (Objects.nonNull(fast) && Objects.nonNull(fast.next)) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
        if (Objects.isNull(head)) {
            return head;
        }

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while (Objects.nonNull(present)) {
            present.next = previous;
            previous = present;
            present = next;
            if (Objects.nonNull(next)) {
                next = next.next;
            }
        }
        return previous; // previous == head, present == null
    }
}
