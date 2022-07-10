package piyali.dsa.scaler.link_list;

import java.util.Objects;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if (Objects.isNull(A))
            return B;
        if (Objects.isNull(B))
            return A;
        ListNode current;
        if (A.val < B.val) {
            current = A;
            A = A.next;
        } else {
            current = B;
            B = B.next;
        }
        ListNode head = current;
        while (Objects.nonNull(A) && Objects.nonNull(B)) {
            if (A.val < B.val) {
                current.next = A;
                A = A.next;
            } else {
                current.next = B;
                B = B.next;
            }
            current = current.next;
        }
        if(Objects.isNull(A))
            current.next = B;
        if (Objects.isNull(B))
            current.next = A;
        return head;
    }

}
