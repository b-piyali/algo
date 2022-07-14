package piyali.dsa.leetcode.ransom_note_383;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        for (char ch : ransomNote.toCharArray()) {
            if (sb.indexOf(ch + "") == -1)
                return false;//the character is not present
            else
                sb.deleteCharAt(sb.indexOf(ch + ""));//if present, delete that from the stringbuilder first
        }
        return true;
    }
}
