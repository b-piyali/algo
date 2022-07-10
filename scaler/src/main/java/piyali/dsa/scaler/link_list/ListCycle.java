package piyali.dsa.scaler.link_list;

import java.util.Objects;

public class ListCycle {
    public ListNode detectCycle(ListNode a) {
        if (Objects.isNull(a) || Objects.isNull(a.next))
            return null;
        ListNode fast = a;
        ListNode slow = a;
        while (Objects.nonNull(fast.next) && Objects.nonNull(fast.next.next)) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.equals(slow)) {
                break;
            }
        }
        if(Objects.isNull(fast.next) || Objects.isNull(fast.next.next))
            return null;
        ListNode head = a;
        while (!head.equals(slow)) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
