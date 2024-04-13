class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int xsize; 
        int ysize;
        xsize=park.length;
        ysize=park[0].length();
        char[][] mp = new char[xsize][ysize];
        int x=0;
        int y=0;
        for(int i=0;i<xsize;i++){
            for(int j=0;j<ysize;j++)
            {
                mp[i][j] = park[i].charAt(j);
                if(mp[i][j]=='S'){
                    x=i; y=j;
                }
            } 
        }
        for(int i=0;i<routes.length;i++){
            String[] list = new String[2];
            list = routes[i].split(" ");
            int num = Integer.parseInt(list[1]);
            int err=0; int k=num;
            if(list[0].equals("W")){
                
                if(y - num < 0){
                    continue;
                }else{
                    while(k!=0){
                        if(mp[x][y-k]=='X'){
                            err=1;
                            break;
                        }
                        k--;
                    }
                    if(err==0) y=y-num;
                }
            }else if(list[0].equals("E")){
                
                if(y + num >= ysize){
                    continue;
                }else{
                    while(k!=0){
                        if(mp[x][y+k]=='X'){
                            err=1;
                            break;
                        }
                        k--;
                    }
                    if(err==0) y=y+num;
                }
            }else if(list[0].equals("N")){
                
                if(x - num < 0){
                    continue;
                }else{
                    while(k!=0){
                        if(mp[x-k][y]=='X'){
                            err=1;
                            break;
                        }
                        k--;
                    }
                    if(err==0) x=x-num;
                }
            }else{
                
                if(x + num >= xsize){
                    continue;
                }else{
                    while(k!=0){
                        if(mp[x+k][y]=='X'){
                            err=1;
                            break;
                        }
                        k--;
                    }
                    if(err==0) x=x+num;
                }
            }
        }
         answer[0]=x;
         answer[1]=y;
        return answer;
    }
}
