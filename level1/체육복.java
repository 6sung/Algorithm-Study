import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int[] student = new int[n];
        for(int i=0;i<n;i++){
            student[i]=1;
        }
        for(int i=0;i<lost.length;i++){
            student[lost[i]-1]=0;
        }
        for(int i=0;i<reserve.length;i++){
            if(student[reserve[i]-1]==0){
                student[reserve[i]-1]=1;
            }else{
                student[reserve[i]-1]++;
            }
        }
        int idx=0;
        while(true){
            if(idx==n) break;
            
            if(student[idx]==2){
                if(idx==0){
                    if(student[idx+1]==0){
                        student[idx]--;
                        student[idx+1]++;
                    }
                }else if(idx==(n-1)){
                    if(student[idx-1]==0){
                        student[idx]--;
                        student[idx-1]++;
                    }
                }
                else if(student[idx-1]==0){
                    student[idx]--;
                    student[idx-1]++;
                }else if(student[idx+1]==0){
                    student[idx]--;
                    student[idx+1]++;
                }
            }
            idx++;
        }
        for(int i=0;i<n;i++){
            if(student[i]>0) answer++;
        }
        return answer;
    }
}
