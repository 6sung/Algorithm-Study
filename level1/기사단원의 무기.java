class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] weapon = new int[number+1];
        weapon[1]=0;
        weapon[number]=0;
        for(int i=2;i<=number-1;i++){
            weapon[i]=0;
        }
        for(int i=1;i<=number;i++){
            for(int j=i;j<=number;j+=i){
                weapon[j]++;
            }
        }
        for(int i=1;i<=number;i++){
            if(weapon[i]>limit){
                weapon[i]=power;
            }
            answer+=weapon[i];
        }
        
        return answer;
    }
}
