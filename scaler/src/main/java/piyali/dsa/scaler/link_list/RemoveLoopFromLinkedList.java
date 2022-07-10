package piyali.dsa.scaler.link_list;

import java.util.Objects;

public class RemoveLoopFromLinkedList {
    public ListNode solve(ListNode A) {
        if (Objects.isNull(A) || Objects.isNull(A.next))
            return null;
        ListNode fast = A;
        ListNode slow = A;
        while (Objects.nonNull(fast.next) && Objects.nonNull(fast.next.next)) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.equals(slow)) {
                break;
            }
        }
        if (Objects.isNull(fast.next) || Objects.isNull(fast.next.next))
            return null;
        ListNode head = A;
        ListNode previous = slow;
        while (!head.equals(slow)) {
            previous = slow;
            head = head.next;
            slow = slow.next;
        }
        previous.next = null;
        return head;
    }
}
