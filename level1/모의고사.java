class Solution {
    public int[] solution(int[] answers) {
        int max = 10000;
        int[] s1 = new int[max];
        int[] s2 = new int[max];
        int[] s3 = new int[max];
        
        for(int i=0;i<max;i++){
            if((i+1)%5==0){
                s1[i]=5;
            }else{
                s1[i]=(i+1)%5;
            }
            
            if(i%2==0){
                s2[i]=2;
            }else{
                if(i==1){ s2[i]=1; }
                else{
                    s2[i]=s2[i-2]+1;
                    if(s2[i]==6) s2[i]=1;
                    if(s2[i]==2) s2[i]=3;
                }
            }
            
            if(i%10==0 || i%10==1){s3[i]=3;}
            else if(i%10==2 || i%10==3){s3[i]=1;}
            else if(i%10==4 || i%10==5){s3[i]=2;}
            else if(i%10==6 || i%10==7){s3[i]=4;}
            else if(i%10==8 || i%10==9){s3[i]=5;}
        }
        int result1=0;
        int result2=0;
        int result3=0;
        int resultMax=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==s1[i]){
                result1++;
                if(resultMax<result1) resultMax=result1;
            }
            if(answers[i]==s2[i]){
                result2++;
                if(resultMax<result2) resultMax=result2;
            }
            if(answers[i]==s3[i]){
                result3++;
                if(resultMax<result3) resultMax=result3;
            }
        }
        int idx=0;
        if(result1==resultMax) idx++;
        if(result2==resultMax) idx++;
        if(result3==resultMax) idx++;
        
        int[] answer = new int[idx];
        idx=0;
        if(result1==resultMax){answer[idx]=1; idx++;}
        if(result2==resultMax){answer[idx]=2; idx++;}
        if(result3==resultMax){answer[idx]=3; idx++;}
        
        return answer;
    }
}
