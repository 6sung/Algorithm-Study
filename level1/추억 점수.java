class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        int size=photo.length;
        answer = new int[size];
        for(int i=0;i<size;i++){
            int point = 0;
            for(int j=0;j<photo[i].length;j++){
                for(int k=0;k<name.length;k++){
                    if(name[k].equals(photo[i][j]))point+=yearning[k];
                }
            }
            answer[i]=point;
        }
        
        return answer;
    }
}
