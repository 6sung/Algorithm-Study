import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] awards = new int[k];
        awards[0]=score[0];
        answer[0]=awards[0];
        
        for(int i=1;i<k;i++){
            if(i>=score.length) continue;
            if(score[i]<awards[0]){
                awards[i]=awards[0];
                awards[0]=score[i];
            }else{
                awards[i]=score[i];
            }
            answer[i]=awards[0];
        }
        Arrays.sort(awards);
        if(k<score.length){
            for (int i = k; i < score.length; i++) {
              if(awards[0]<score[i]){
                  awards[0]=score[i];
                  Arrays.sort(awards);
              }
              answer[i] = awards[0];
          }    
        }
        return answer;
    }
}
