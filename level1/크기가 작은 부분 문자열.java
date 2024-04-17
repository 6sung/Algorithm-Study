class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int idx=0;
        int chkidx=p.length();
        
        while(true){
            if(idx+p.length() > t.length()) break;
            long x = Long.parseLong(p);
            long y = Long.parseLong(t.substring(idx,idx+p.length()));
            if(x-y>=0){
                answer++;
            }
            idx++;
        
        }
        
        return answer;
    }
}
