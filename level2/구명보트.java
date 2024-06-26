import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int left=0;
        int right=people.length-1;
        while(true){
            if(right<left) break;
            
            int p=people[right];
            if(p + people[left] <= limit){
                left++;
            }
            answer++;
            right--;
        }
        return answer;
    }
}
