class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero=0;
        int cnt=0;
        for(int i=0;i<6;i++){
            if(lottos[i]==0){
                zero++;
                continue;
            }
            for(int j=0;j<6;j++){
                if(lottos[i]==win_nums[j]){
                    cnt++;
                    continue;
                }
            }
        }
        int rank=7;
        answer[0]=rank-zero-cnt;
        answer[1]=rank-cnt;
        if(answer[1]==7) answer[1]=6;
        if(answer[0]==7) answer[0]=6;
        return answer;
    }
}
