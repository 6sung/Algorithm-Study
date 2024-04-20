class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx=0;
        int xcnt=0;
        int ycnt=0;
        int cnt=0;
        while(true){
            if((idx+cnt)>=s.length()){
                if (idx==s.length()){
                    break;
                }else{
                    answer++;
                    break;
                }
                
            }
            if(s.charAt(idx)==s.charAt(idx+cnt)){
                xcnt++;
                cnt++;
            }else{
                ycnt++;
                cnt++;
            }
            
            if(xcnt==ycnt){
                answer++;
                xcnt=0;
                ycnt=0;
                idx+=cnt;
                cnt=0;
            }
        }
        return answer;
    }
}
