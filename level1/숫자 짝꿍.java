class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xArray = new int[10];
        int[] yArray = new int[10];
        for(String temp : X.split("")){
            Integer index = Integer.parseInt(temp);
            xArray[index]++;
        }
        for(String temp : Y.split("")){
            Integer index = Integer.parseInt(temp);
            yArray[index]++;
        }
        int[] answerArray = new int[10];
        for(int i=0; i<10; i++){
            answerArray[i] = xArray[i] >= yArray[i] ? yArray[i] : xArray[i]; 
        }
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            for(int j=0; j<answerArray[i]; j++){
                sb.append(i);
            }
        }
        answer = sb.toString();
        if(answer.equals("")) answer = "-1";
        else if(answer.replace("0","") == "") answer = "0";
        return answer;
    }
}
