class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        char[][] wall = new char[wallpaper.length][wallpaper[0].length()];
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[0].length();j++){
                wall[i][j]=wallpaper[i].charAt(j);
            }
        }
        
        int cmin=110;
        int rmin=110;
        int cmax=0;
        int rmax=0;
        
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[0].length();j++){
                if(wall[i][j]=='#'){
                    if(cmin>i) cmin=i;
                    if(rmin>j) rmin=j;
                    if(cmax<i) cmax=i;
                    if(rmax<j) rmax=j;
                }
            }
        }
        answer[0]=cmin;
        answer[1]=rmin;
        answer[2]=cmax+1;
        answer[3]=rmax+1;
        return answer;
    }
}
