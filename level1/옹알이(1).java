class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        answer=babbling.length;
        for(int i=0;i<babbling.length;i++){
            int index=0;
            while(index<babbling[i].length()){
                if(babbling[i].length()>=(index+3) && babbling[i].substring(index,index+3).equals("aya")){
                    if(index>2 && babbling[i].substring(index-3,index).equals("aya")){answer--; break;}
                    index+=3;
                }else if(babbling[i].length()>=(index+2) &&babbling[i].substring(index,index+2).equals("ye")){
                    if(index>1 && babbling[i].substring(index-2,index).equals("ye")){answer--; break;}
                    index+=2;
                }else if(babbling[i].length()>=(index+3) &&babbling[i].substring(index,index+3).equals("woo")){
                    if(index>2 && babbling[i].substring(index-3,index).equals("woo")){answer--; break;}
                    index+=3;
                }else if(babbling[i].length()>=(index+2) &&babbling[i].substring(index,index+2).equals("ma")){
                    if(index>1 && babbling[i].substring(index-2,index).equals("ma")){answer--; break;}
                    index+=2;
                }else{
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}
