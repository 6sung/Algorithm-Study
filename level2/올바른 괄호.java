class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] word = new char[s.length()];
        int index=0;
        int count=0;
        while(true){
            char ch = s.charAt(index+count);
            if(ch=='('){
                word[index]='(';
            }else{
                word[index]=')';
            }
            
            if(index>=1){
                if(word[index]==')'){
                    if(word[index-1]=='('){
                        word[index]='d';
                        word[index-1]='d';
                        count+=2;
                        index-=2;
                    }
                }
            }
            index++;
            if(index+count >= s.length()) break;
        }
        if(word[0]=='d'){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }
}
