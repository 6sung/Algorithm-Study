class Solution {
    public String solution(String new_id) {
        String answer = "";
        char[] word = new char[new_id.length()];
        for(int i=0;i<new_id.length();i++){
            word[i]=new_id.charAt(i);
        }
        int idx=0;
        for(int i=0;i<new_id.length();i++){
            int tmp=(int)word[i];
            if(tmp>=65 && tmp<=90) tmp+=32;
            word[i]=(char)tmp;
        }
        
        for(int i=0;i<new_id.length();i++){
            int tmp=(int)word[i];
            if(tmp!=45 && tmp!=95 && tmp!=46 && (tmp<48 || tmp>57) && (tmp<97 || tmp>122)){
                word[i]=' ';
            }
        }
        
        for(int i=0;i<new_id.length();i++){
            if(word[i]=='.'){
                idx=i+1;
                while(idx<new_id.length()){
                    if(word[idx]==' '){
                        idx++;
                    }
                    else if(word[idx]=='.'){
                        word[idx]=' ';
                        idx++;
                    }else{
                        break;
                    }
                }
            }
        }
        idx=0;
        while(idx<new_id.length()){
            if(word[idx]==' '){
                idx++;
            }else if(word[idx]=='.'){
                word[idx]=' ';
                break;
            }else{
                break;
            }
        }
        idx=new_id.length()-1;
        while(idx>0){
            if(word[idx]==' '){
                idx--;
            }else if(word[idx]=='.'){
                word[idx]=' ';
                break;
            }else{
                break;
            }
        }

        int cnt=0;
        for(int i=0;i<new_id.length();i++){
            if(word[i]==' ') cnt++;
        }
        if(cnt==new_id.length()) word[0]='a';
        
        cnt=0;
        for(int i=0;i<new_id.length();i++){
            if(word[i]!=' ') cnt++;
            if(cnt==15){
                if(word[i]=='.') word[i]=' ';
            }else if(cnt>15){
                word[i]=' ';
            }
        }
        
        cnt=0;
        for(int i=0;i<new_id.length();i++){
            if(word[i]!=' ') cnt++;
        }
      
        for(int i=0;i<new_id.length();i++){
            if(word[i]!=' ')answer+=word[i];
        }
        if(cnt<3){
            char last=' ';
            for(int i=new_id.length()-1;i>=0;i--){
                if(word[i]!=' '){
                    last=word[i];
                    break;
                }
            }
            for(int i=0;i<3-cnt;i++){
                answer+=last;
            }
        }
       
        return answer;
    }
}
