class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int idx=left;
        int i;
        while(idx<=right){
            int cnt=0;
            for(i=1;i<=idx;i++){
                if(idx%i==0) cnt++;
            }
            if(cnt%2==0){
                answer=answer+idx;
            }else{
                answer=answer-idx;
            }
            idx++;
        }
        return answer;
    }
}
