class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a;
        int b;
        if(sides[0]>=sides[1]){
            a=sides[0];
            b=sides[1];
        }else{
            a=sides[1];
            b=sides[0];
        }
        int idx=a;
        while(idx+b>a){
            if(idx>a) break;
            answer++;
            idx--;
        }
        idx=a+1;
        while(a+b>idx){
            answer++;
            idx++;
        }
        return answer;
    }
}
