package piyali.dsa.leetcode.implement_queue_using_stacks_232;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public ImplementQueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (stack1.size() > 1) {
            stack2.push(stack1.pop());
        }
        int x = stack1.pop();
        while (stack2.size() > 0)
            stack1.push(stack2.pop());
        return x;
    }

    public int peek() {
        while (stack1.size() > 0) {
            stack2.push(stack1.pop());
        }
        int x = stack2.peek();
        while (stack2.size() > 0)
            stack1.push(stack2.pop());
        return x;
    }

    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }

}
