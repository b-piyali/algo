package piyali.dsa.leetcode.first_unique_character_string_387;

public class FirstUniqueCharacterString {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        int[] count = new int[26];

        for (char c : ch) {
            count[c - 'a'] += 1;
        }

        for (int i = 0; i < ch.length; i++) {
            if (count[ch[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
