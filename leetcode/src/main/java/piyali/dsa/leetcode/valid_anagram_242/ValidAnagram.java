package piyali.dsa.leetcode.valid_anagram_242;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> charMapS = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charMapS.merge(ch, 1, Integer::sum);
        }
        for (char ch : t.toCharArray()) {
            if (!charMapS.containsKey(ch))
                return false;
            charMapS.merge(ch, -1, Integer::sum);
        }
        for (Map.Entry<Character, Integer> entry : charMapS.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    }
}
