class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int hp;
        hp=health;
        int second=1;
        int squence=0;
        int idx=0;
        while(true){
            if(hp<0 || idx == attacks.length)  break;
            if(attacks[idx][0]==second){
                if(hp-attacks[idx][1]<0){
                    hp=-1;
                    break;
                }
                hp=hp-attacks[idx][1];
                squence=0;
                second++;
                idx++;
            }else{
                second++;
                squence++;
                if(squence==bandage[0]){
                    squence=0;
                    hp=hp+bandage[1]+bandage[2];
                    if(hp>health) hp=health;
                }else{
                    if(squence==bandage[0]){
                        hp=hp+bandage[1]+bandage[2];
                    }else{
                        hp+=bandage[1];
                    }
                    if(hp>health) hp=health;
                }
            }
        }
        if(hp==0) hp=-1;
        answer=hp;
        return answer;
    }
}
