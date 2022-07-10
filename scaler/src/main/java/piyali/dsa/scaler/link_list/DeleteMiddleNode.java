package piyali.dsa.scaler.link_list;

import java.util.Objects;

public class DeleteMiddleNode {
    public ListNode solve(ListNode A) {
        if (Objects.isNull(A))
            return null;
        int len = length(A);
        if (len < 2)
            return null;
        if (len == 2)
            return A.next;

        int mid = len / 2;
        ListNode pre = A;
        int count = 0;
        while (pre != null) {
            count++;
            if (count == mid) {
                pre.next = pre.next.next;
            }
            pre = pre.next;
        }
        return A;
    }

    private int length(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
