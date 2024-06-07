import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        int N = s.length();
        for(int i=0;i<N;i++){
            char a = s.charAt(i);
            if(stack.size()!=0 && stack.peek() == a){
                stack.pop();
            }else{
                stack.push(a);
            }
        }
        if(stack.size()==0){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
}
