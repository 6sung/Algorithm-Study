class Solution {
    public int solution(int n) {
        int x=n;
        String number="";
        int nCnt=0;
        while(true){
            if(x>=2){
                if(x%2==1){
                    nCnt++;
                }
                x=x/2;
            }else{
                nCnt++;
                break;
            }
        }
        int idx=n+1;
        while(true){
            int cnt=0;
            int x1=idx;
            while(true){
                if(x1>=2){
                    if(x1%2==1){
                        cnt++;
                    }
                    x1=x1/2;
                }else{
                    cnt++;
                    break;
                }
            }
            if(cnt==nCnt) break;
            idx++;
        }
        return idx;
    }
}
