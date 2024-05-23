import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int size = s.length();
        char[] array = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            array[i] = s.charAt(i);
        }
        for(int i=0; i<size; i++){
            if(array[i] == ' ')continue;
            for(int j=1; j<=n; j++){
                if(array[i] == 'z'){
                    array[i] = 'a';
                    continue;
                }
                else if(array[i] == 'Z'){
                    array[i] = 'A';
                    continue;
                }
                arr[i] = (char)(array[i] + 1);
            }
        }
        answer = new String(array);
        return answer;
    }
}
