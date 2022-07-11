package piyali.dsa.scaler.link_list;

import java.util.Objects;
import java.util.Stack;

/**
 * Problem Description
 * Write a program to find the node at which the intersection of two singly linked lists, A and B, begins. For example, the following two linked lists:
 * A:          a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B:     b1 → b2 → b3
 * NOTE:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * The custom input to be given is different than the one explained in the examples. Please be careful.
 * <p>
 * Problem Constraints
 * 0 <= |A|, |B| <= 106
 * <p>
 * Input Format
 * The first argument of input contains a pointer to the head of the linked list A.
 * The second argument of input contains a pointer to the head of the linked list B.
 * <p>
 * Output Format
 * Return a pointer to the node after which the linked list is intersecting.
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [6, 3, 4, 5]
 * <p>
 * Input 2:
 * A = [1, 2, 3]
 * B = [4, 5]
 * <p>
 * Example Output
 * Output 1:
 * [3, 4, 5]
 * <p>
 * Output 2:
 * []
 * <p>
 * Example Explanation
 * Explanation 1:
 * In the first example, the nodes have the same values after 3rd node in A
 * and 2nd node in B. Thus, the linked lists are intersecting after that point.
 * <p>
 * Explanation 2:
 * In the second example, the nodes don't have the same values,
 * thus we can return None/Null.
 */

public class IntersectionLinkedLists {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        if (Objects.isNull(A) || Objects.isNull(B))
            return null;

        Stack<ListNode> nodesA = new Stack<>();
        Stack<ListNode> nodesB = new Stack<>();

        while (A != null) {
            nodesA.add(A);
            A = A.next;
        }

        while (B != null) {
            nodesB.add(B);
            B = B.next;
        }

        ListNode node = null;
        while (nodesA.size() > 0 &&
                nodesB.size() > 0 &&
                nodesA.peek().equals(nodesB.peek())) {
            node = nodesA.pop();
            nodesB.pop();
        }
        return node;
    }
}
