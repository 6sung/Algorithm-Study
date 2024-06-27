import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class Solution {
    private static void genNum(String prefix, String num, Set<Integer> numSet) {
        if (!prefix.isEmpty()) {
            numSet.add(Integer.parseInt(prefix));
        }
        for (int i = 0; i < num.length(); i++) {
            genNum(prefix + num.charAt(i), num.substring(0, i) + num.substring(i + 1), numSet);
        }
    }
    
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> numSet = new HashSet<>();
        
        genNum("",numbers, numSet);
        
        for(int n : numSet){
            int chk=0;
            if(n<2) continue;
            for(int j=2;j<=n/2;j++){
                if(n%j==0){
                    chk=1;
                    break;
                }
            }
            if(chk==0) answer++;
            
        }
        
        return answer;
    }
}
