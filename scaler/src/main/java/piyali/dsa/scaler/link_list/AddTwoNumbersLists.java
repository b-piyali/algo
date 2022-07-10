package piyali.dsa.scaler.link_list;

public class AddTwoNumbersLists {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        int carry = 0;
        ListNode dummy = new ListNode(carry);
        ListNode p = dummy;
        while (A != null || B != null || carry != 0) {
            if (A != null) {
                carry += A.val;
                A = A.next;
            }
            if (B != null) {
                carry += B.val;
                B = B.next;
            }
            p.next = new ListNode(carry % 10);
            carry /= 10;
            p = p.next;
        }
        return dummy.next;
    }
}
