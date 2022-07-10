package piyali.dsa.scaler.link_list;

import java.util.Objects;

public class SwapListNodesPairs {
    public ListNode swapPairs(ListNode A) {
        if (Objects.isNull(A) || Objects.isNull(A.next))
            return A;

        ListNode prv = null;
        ListNode curr = A;
        ListNode next = curr.next;
        ListNode ans = next;

        while (curr != null && next != null) {
            curr.next = next.next;
            next.next = curr;

            if (prv != null)
                prv.next = next;

            prv = curr;
            curr = curr.next;

            if (curr != null)
                next = curr.next;
        }

        return ans;
    }
}
