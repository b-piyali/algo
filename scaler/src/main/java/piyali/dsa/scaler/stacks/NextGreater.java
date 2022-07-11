package piyali.dsa.scaler.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Stack;

public class NextGreater {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        if (Objects.isNull(A) || A.size() == 0)
            return null;

        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(A.size(), -1));
        Stack<Integer> stack = new Stack<>();

        for (int i = A.size() - 1; i >= 0; i--) {
            while (stack.size() > 0 && A.get(i) >= stack.peek()) {
                stack.pop();
            }
            if (stack.size() > 0)
                result.set(i, stack.peek());

            stack.push(A.get(i));
        }

        return result;
    }
}
