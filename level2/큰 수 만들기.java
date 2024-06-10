import java.util.Stack;
class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        String answer = "";
        int size=number.length();
        for(int i=0;i<size;i++){
            while(stack.size()!=0 && stack.peek()<number.charAt(i) && k>0){
                stack.pop();
                k--;
            }
            stack.push(number.charAt(i));
            
        }
        
        for(int i=0;i<stack.size()-k;i++){
            answer=answer+stack.get(i);
        }
        return answer;
    }
}
