class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1;i<=yellow;i++){
            if(yellow%i==0){
                int k=i;
                int j=(yellow/i);
                if((k*2+j*2+4) == brown){
                    if(k>=j){
                        answer[0]=k+2;
                        answer[1]=j+2;
                        break;
                    }else{
                        answer[0]=j+2;
                        answer[1]=k+2;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}
