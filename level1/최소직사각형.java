class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = sizes.length;
        int idx=1;
        int x=sizes[0][0];
        int y=sizes[0][1];
        while(true){
            if(idx>=max) break;
            int mx;
            int mn;
            if(x>y){
                if(sizes[idx][0]>sizes[idx][1]){
                    mx=sizes[idx][0];
                    mn=sizes[idx][1];
                }else{
                    mx=sizes[idx][1];
                    mn=sizes[idx][0];
                }
                if(x<mx){
                    x=mx;
                }
                if(y<mn){
                    y=mn;
                }
            }else{
                if(sizes[idx][0]>sizes[idx][1]){
                    mx=sizes[idx][0];
                    mn=sizes[idx][1];
                }else{
                    mx=sizes[idx][1];
                    mn=sizes[idx][0];
                }
                if(y<mx){
                    y=mx;
                }
                if(x<mn){
                    x=mn;
                }
            }
            idx++;
        }
        answer=x*y;
        return answer;
    }
}
