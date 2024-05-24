import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        int index=0;
        for(int i=0;i<len;i++){
            int size=commands[i][1]-commands[i][0];
            int[] word = new int[size+1];
            int idx=0;
            for(int j=commands[i][0];j<=commands[i][1];j++){
                word[idx]=array[j-1];
                idx++;
            }
            Arrays.sort(word);
            idx=commands[i][2];
            answer[index]=word[idx-1];
            index++;
        }
        return answer;
    }
}
