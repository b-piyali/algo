package piyali.dsa.scaler.stacks;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class CheckTwoBracketExpressions {
    public int solve(String A, String B) {
        Integer[] output1 = checkBracket(A);
        Integer[] output2 = checkBracket(B);
        return Arrays.equals(output1, output2) ? 1 : 0;
    }

    private Integer[] checkBracket(String input) {
        Stack<Boolean> expression = new Stack<>();
        Integer[] arr = new Integer[26];
        IntStream.range(0, 26).forEach((a) -> arr[a] = -1);
        expression.add(true);

        for (int i = 0; i < input.length(); ++i) {
            if (isClosingBracket(input.charAt(i))) {
                expression.pop();
            }

            if (i == 0 && isOpenBracket(input.charAt(i))) {
                expression.add(expression.peek());
                continue;
            }

            if (isOpenBracket(input.charAt(i)) && isOperator(input.charAt(i - 1))) {
                expression.add(expression.peek() == getSymbol(input.charAt(i - 1)));
                continue;
            }

            if (isOpenBracket(input.charAt(i))) {
                expression.add(expression.peek());
                continue;
            }

            if (!isBracket(input.charAt(i)) && !isOperator(input.charAt(i))) {
                int index = input.charAt(i) - 'a';
                if (i != 0 && isOperator(input.charAt(i - 1))) {
                    //If both operators are same in that case ‘+’ should come else ‘-’
                    arr[index] = (expression.peek() == getSymbol(input.charAt(i - 1))) ? 1 : 0;
                } else {
                    arr[index] = expression.peek() ? 1 : 0;
                }
            }
        }

        return arr;
    }

    private boolean isOperator(char ch) {
        return ch == '-' || ch == '+';
    }

    private boolean isClosingBracket(char ch) {
        return ch == ')';
    }

    private boolean isOpenBracket(char ch) {
        return ch == '(';
    }

    private boolean isBracket(char ch) {
        return ch == '(' || ch == ')';
    }

    private boolean getSymbol(char ch) {
        return ch == '+';
    }
}
