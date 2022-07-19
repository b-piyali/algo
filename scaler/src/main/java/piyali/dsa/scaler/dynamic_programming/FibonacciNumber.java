package piyali.dsa.scaler.dynamic_programming;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fibonacci(num));
    }

    private static int fibonacci(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[num] = dp[num - 1] + dp[num - 2];
        return dp[num];
    }
}
