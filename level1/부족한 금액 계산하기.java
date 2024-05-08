class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long ticket = 0;
        
        for(int i=1;i<=count;i++){
            ticket=ticket+i*price;
        }
        
        if(money>=ticket){
            return 0;
        }else{
            answer=ticket-money;
            return answer;
        }
    }
}
