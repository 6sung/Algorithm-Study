class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[][] word = {
            {"R", "T"},
            {"C", "F"},
            {"J", "M"},
            {"A", "N"}
        };
        
        int[][] array=new int[4][2];
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                array[i][j]=0;
            }
        }
        
        for(int i=0;i<choices.length;i++){
            int score=choices[i];
            String firstPart = survey[i].substring(0,1);
            if(firstPart.equals("R") || firstPart.equals("T") ){
                if(firstPart.equals("T")){
                    score=8-score;
                }
                if(score<4){
                    array[0][0]=array[0][0]+4-score;
                }else if(score>4){
                    array[0][1]=array[0][1]+score-4;
                }
            }else if(firstPart.equals("C") || firstPart.equals("F") ){
                if(firstPart.equals("F")){
                    score=8-score;
                }
                if(score<4){
                    array[1][0]=array[1][0]+4-score;
                }else if(score>4){
                    array[1][1]=array[1][1]+score-4;
                }
                
            }else if(firstPart.equals("J") || firstPart.equals("M") ){
                if(firstPart.equals("M")){
                    score=8-score;
                }
                if(score<4){
                    array[2][0]=array[2][0]+4-score;
                }else if(score>4){
                    array[2][1]=array[2][1]+score-4;
                }
            }else{
                if(firstPart.equals("N")){
                    score=8-score;
                }
                if(score<4){
                    array[3][0]=array[3][0]+4-score;
                }else if(score>4){
                    array[3][1]=array[3][1]+score-4;
                }
            }
        }
        for(int i=0;i<4;i++){
            if(array[i][0]>=array[i][1]){
                answer+=word[i][0];
            }else{
                answer+=word[i][1];
            }
        }
        return answer;
        
    }
}
