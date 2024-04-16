class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] word = new char[s.length()];
        for(int i=0;i<s.length();i++){
            word[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            int idx=i;
            int cnt=0;
            while(true){
                idx--;
                cnt++;
                if(idx<0){
                    answer[i]=-1;
                    break;
                }
                if(word[idx]==word[i]){
                    answer[i]=cnt;
                    break;
                }
            }
        }
        return answer;
    }
}
