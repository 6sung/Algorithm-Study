class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int maxIdx=ingredient.length;
        int[] stack = new int [maxIdx];
        int i=0;
        int idx=0;
        while(true){
            if(idx<3){
                stack[idx]=ingredient[i];
                i++;
                idx++;
            }else{
                stack[idx]=ingredient[i];
                if(stack[idx]==1 && stack[idx-1]==3 && stack[idx-2]==2 && stack[idx-3]==1){
                    stack[idx]=0;
                    stack[idx-1]=0;
                    stack[idx-2]=0;
                    stack[idx-3]=0;
                    answer++;
                    idx=idx-3;
                    i++;
                }else{
                    i++;
                    idx++;
                }
            }
            if(i>=ingredient.length) break;
        }
        return answer;
    }
}
