package piyali.dsa.scaler.link_list;

import java.util.Objects;

public class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode A) {
        if (Objects.isNull(A) || Objects.isNull(A.next))
            return A;
        ListNode currntNode = A;
        while (currntNode.next != null) {
            if (currntNode.val == currntNode.next.val) {
                currntNode.next = currntNode.next.next;
            } else
                currntNode = currntNode.next;

        }
        return A;
    }
}
