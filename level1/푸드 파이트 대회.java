class Solution {
    public String solution(int[] food) {
        String answer = "";
        int cnt =1;
        int len = food.length;
        while(true){
            for(int i=0;i<food[cnt]/2;i++){
                answer = answer + Integer.toString(cnt);
            }
            cnt++;
            if(cnt > len-1) break;
        }
        for(int i=0;i<food[0];i++) answer = answer + '0';
        cnt = food.length;
        while(true){
            for(int i=0;i<food[cnt-1]/2;i++){
                answer = answer + Integer.toString(cnt-1);
            }
            cnt--;
            if(cnt==0) break;
        }
        
    return answer;
    }
}
