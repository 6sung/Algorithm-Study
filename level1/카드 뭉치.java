class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int check=0;
        int cardck1=0;
        int cardck2=0;
        for(int i=0;i<goal.length;i++){
            if(cards1[cardck1].equals(goal[i])){
                cardck1++;
                if(cardck1==cards1.length) cardck1--;
            }else if(cards2[cardck2].equals(goal[i])){
                cardck2++;
                if(cardck2==cards2.length) cardck2--;
            }else{
                check=1;
                break;
            }
        }
        answer="Yes";
        if(check==1) answer="No";
        return answer;
          
    }
}
