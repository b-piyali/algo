package piyali.dsa.leetcode.valid_parentheses_20;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 0 ||
                ((s.length() & 1) == 1) ||
                (s.charAt(0) != '(' && s.charAt(0) != '{' && s.charAt(0) != '['))
            return false;

        Stack<Character> chs = new Stack<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                chs.push(c);
                count++;
            } else if (chs.size() > 0 &&
                    ((c == ')' && '(' == chs.peek()) ||
                            (c == '}' && '{' == chs.peek()) ||
                            (c == ']' && '[' == chs.peek()))) {
                chs.pop();
                count--;
            } else {
                count++;
            }
        }
        return (chs.empty() && count == 0);
    }
}
