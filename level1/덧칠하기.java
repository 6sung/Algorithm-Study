class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] space = new int[n];
        for(int i=0;i<n;i++){
            space[i]=1;
            
        }
        for(int j=0;j<section.length;j++){
            space[section[j]-1]=0;
        }
        int result=0;
        int mxidx=0;
        while(true){
            int chk=0;
            int idx=0;
            for(int i=mxidx;i<n;i++){
                if(space[i]==0 && chk==0){
                    idx=i;
                    chk=1;
                }
            }
            if(idx==0 && space[0]==1) break;
            mxidx=idx;
            for(int i=idx;i<idx+m;i++){
                if(i<n){
                    space[i]=1;    
                }
            }
            result++;
        }
        answer=result;
        return answer;
    }
}
