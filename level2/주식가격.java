import java.util.Stack;
import java.util.List;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<List<Integer>> stack = new Stack<>();
        
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty() && prices[i] < stack.peek().get(0)){
                List<Integer> l = stack.pop();
                answer[l.get(1)] = i-l.get(1);
            }
            stack.push(List.of(prices[i],i));
        }
        while(true){
            if(stack.isEmpty()) break;
            List<Integer> l = stack.pop();
            answer[l.get(1)]=prices.length-l.get(1)-1;
        }
        
        return answer;
    }
}
