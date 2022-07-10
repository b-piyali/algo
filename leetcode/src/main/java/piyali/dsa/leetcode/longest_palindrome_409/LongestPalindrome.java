package piyali.dsa.leetcode.longest_palindrome_409;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (Objects.isNull(s) || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charFreqs = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charFreqs.merge(ch, 1, Integer::sum);
        }
        int len = 0;
        boolean isOdd = false;

        for (int val : charFreqs.values()) {
            if ((val & 1) == 1) {
                len += val - 1;
                isOdd = true;
            } else
                len += val;
        }
        return isOdd ? len + 1 : len;
    }
}
