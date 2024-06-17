import java.util.Stack;
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        for(int i=progresses.length-1;i>=0;i--){
            stack.push(progresses[i]);
        }
        List<Integer> answerList = new ArrayList<>();
        int idx=0;
        int dayCount=1;
        int answerIdx=0;
        while(idx<progresses.length){
            int cnt=0;
            int k=stack.peek();
            if(k + (dayCount*speeds[idx]) >= 100){
                cnt++;
                stack.pop();
                idx++;
                while(true){
                    if(idx==progresses.length) break;
                    if(stack.peek() + (dayCount*speeds[idx]) >= 100){
                        cnt++;
                        stack.pop();
                        idx++;
                    }else{
                        break;
                    }
                }
                dayCount++;
                answerList.add(cnt);
                answerIdx++;
            }else{
                dayCount++;
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i]=answerList.get(i);
        }
        return answer;
    }
}
