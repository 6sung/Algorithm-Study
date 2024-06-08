import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> set = new HashSet<>();
        char prev = words[0].charAt(words[0].length() - 1);
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);

            if (set.contains(word) || prev != firstChar) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }

            set.add(word);
            prev = lastChar;
        }

        return new int[]{0,0};
    }
}
