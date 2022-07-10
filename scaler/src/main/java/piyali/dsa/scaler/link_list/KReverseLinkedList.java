package piyali.dsa.scaler.link_list;

import java.util.Objects;

public class KReverseLinkedList {
    public ListNode reverseList(ListNode A, int B) {
        if (Objects.isNull(A) || Objects.isNull(A.next))
            return A;
        ListNode head = A;
        ListNode pre = A;
        ListNode currentNode = A.next;

        while (currentNode != null) {
            ListNode tempNode = currentNode.next;
            pre.next = tempNode;
            currentNode.next = head;
            head = currentNode;
            currentNode = tempNode;
        }
        return head;
    }
}
