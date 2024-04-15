import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int idx=score.length;
        while(true){
            if((idx-m)<0){
                break;
            }
            if(score[idx-m]>=k){
                answer=answer+(k*m);
            }else{
                answer=answer+(score[idx-m]*m);
            }
            idx-=m;
        }
        return answer;
    }
}
