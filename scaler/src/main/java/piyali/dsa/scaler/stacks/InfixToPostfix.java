package piyali.dsa.scaler.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {
    public String solve(String A) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('^', 1);
        map.put('/', 2);
        map.put('*', 2);
        map.put('+', 3);
        map.put('-', 3);

        for (char ch : A.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                sb.append(ch);
            else if (ch == '(')
                stack.push(ch);
            else if (ch == ')') {
                while (stack.peek() != '(') {
                    sb.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && (map.get(stack.peek()) <= map.get(ch))) {
                    sb.append(stack.peek());
                    stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.peek());
            stack.pop();
        }

        return sb.toString();
    }
}
