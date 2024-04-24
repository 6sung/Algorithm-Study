class Solution {
    public int solution(String s) {
        String word="";
        int answer = 0;
        int idx=0;
        while(idx<s.length()){
            char a = s.charAt(idx);
            int b = (int)a;
            if(a>=48 && a<=57){
                word+=a;
                idx++;
            }else{
                if(a=='z'){
                    word+="0";
                    idx+=4;
                }else if(a=='o'){
                    word+="1";
                    idx+=3;
                }else if(a=='t' && s.charAt(idx+1) == 'w'){
                    word+="2";
                    idx+=3;
                }else if(a=='t' && s.charAt(idx+1) == 'h'){
                    word+="3";
                    idx+=5;
                }else if(a=='f' && s.charAt(idx+1) == 'o'){
                    word+="4";
                    idx+=4;
                }else if(a=='f' && s.charAt(idx+1) == 'i'){
                    word+="5";
                    idx+=4;
                }else if(a=='s' && s.charAt(idx+1) == 'i'){
                    word+="6";
                    idx+=3;
                }else if(a=='s' && s.charAt(idx+1) == 'e'){
                    word+="7";
                    idx+=5;
                }else if(a=='e'){
                    word+="8";
                    idx+=5;
                }else if(a=='n'){
                    word+="9";
                    idx+=4;
                }
            }
        }
        answer = Integer.parseInt(word);
        return answer;
    }
}
