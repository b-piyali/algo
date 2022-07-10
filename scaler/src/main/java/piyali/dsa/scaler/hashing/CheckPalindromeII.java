package piyali.dsa.scaler.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * Given a string A consisting of lowercase characters.
 * Check if characters of the given string can be rearranged to form a palindrome.
 * Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 105
 * A consists only of lower-case characters.
 * <p>
 * Input Format
 * First argument is an string A.
 * <p>
 * Output Format
 * Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.
 */
public class CheckPalindromeII {
    public int solve(String A) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : A.toCharArray()) {
            charMap.merge(ch, 1, Integer::sum);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> ch : charMap.entrySet()) {
            if (ch.getValue() % 2 == 1) {
                count++;
                if (count > 1)
                    return 0;
            }
        }
        return 1;
    }
}
