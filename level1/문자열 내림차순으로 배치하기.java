import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        return new StringBuilder(sortedString).reverse().toString();
    }
}
