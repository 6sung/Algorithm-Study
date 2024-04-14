class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int [] word = new int[50];
        int [] skword = new int[10];
        for(int i=0;i<s.length();i++){
            word[i]=(int)s.charAt(i);
        }
        for(int i=0;i<skip.length();i++){
            skword[i]=(int)skip.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            int cnt=index;
            while(cnt>0){
                int check=0;
                int check2=0;
                if((word[i]+1) == 123){
                    word[i]=97;
                    for(int j=0;j<skip.length();j++){
                        if(skword[j]==97){
                            check2=1;
                        }
                    }
                    if(check2==0){
                        cnt--;    
                    }
                    
                }else{
                    for(int j=0;j<skip.length();j++){
                        if( (word[i]+1) == skword[j]){
                            check=1;    
                        }
                    }
                    if(check==1){
                        word[i]+=1;
                    }else{
                        word[i]+=1;
                        cnt--;
                    }
                }
            }
        }
        for(int i=0;i<s.length();i++){
            answer += (char) word[i];
        }
        return answer;
    }    
}
