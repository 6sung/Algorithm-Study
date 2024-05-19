class Solution {
    public int prime(int num){
        int chk=0;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                chk=1;
                break;
            }
        }
        if(chk==1){
            return 0;
        }else{
            return 1;
        }
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=(i+1);j<nums.length;j++){
                for(int k=(j+1);k<nums.length;k++){
                    int chk = prime(nums[i]+nums[j]+nums[k]);
                    if(chk==1){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
