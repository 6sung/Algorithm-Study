import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int len=0;
        for(int i=1;i<numbers.length;i++){
            len+=i;
        }
        int[] word = new int[len];
        
        int idx=0;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                word[idx]=numbers[i]+numbers[j];
                idx++;
            }
        }
        Arrays.sort(word);
        int index=0;
        for(int i=1;i<idx;i++){
            if(word[i]==word[i-1]) index++;
        }
        int[] answer = new int[idx-index];
        index=1;
        answer[0]=word[0];
        for(int i=1;i<idx;i++){
            if(word[i]!=word[i-1]){
                answer[index]=word[i];
                index++;
            }
        }
        return answer;
    }
}
