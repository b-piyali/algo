package piyali.dsa.scaler.link_list;

import java.util.Objects;

public class MiddleElement {
    public int solve(ListNode A) {
        if (Objects.isNull(A))
            return 0;
        ListNode slow = A;
        ListNode fast = A;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
