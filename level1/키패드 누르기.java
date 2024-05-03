class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        char[][] array = {{'7', '8', '9'},{'4', '5', '6'},{'1', '2', '3'},{'*','0', '#'}};
        int lx=3; int ly=0;
        int rx=3; int ry=2;
        
        int idx=0;
        while(idx<numbers.length){
            int k=numbers[idx];
            if(k==1 || k==4 || k==7){
                switch(k){
                    case 1: lx=0; ly=0; break;
                    case 4: lx=1; ly=0; break;
                    case 7: lx=2; ly=0; break;
                }
                answer+="L";
            }else if(k==3 || k==6 || k==9){
                switch(k){
                    case 3: rx=0; ry=2; break;
                    case 6: rx=1; ry=2; break;
                    case 9: rx=2; ry=2; break;
                }
                answer+="R";
            }else{
                int lidx=0;
                int ridx=0;
                int xnum=0;
                int ynum=0;
                switch(k){
                    case 8: 
                        lidx=Math.abs(lx-2)+Math.abs(1-ly);
                        ridx=Math.abs(rx-2)+Math.abs(ry-1);
                        xnum=2; ynum=1;
                        break;
                    case 5: 
                        lidx=Math.abs(lx-1)+Math.abs(1-ly);
                        ridx=Math.abs(rx-1)+Math.abs(ry-1);
                        xnum=1; ynum=1;
                        break;
                    case 2: 
                        lidx=Math.abs(lx)+Math.abs(1-ly);
                        ridx=Math.abs(rx)+Math.abs(ry-1);
                        xnum=0; ynum=1;
                        break;
                    case 0:
                        lidx=Math.abs(lx-3)+Math.abs(1-ly);
                        ridx=Math.abs(rx-3)+Math.abs(ry-1);
                        xnum=3; ynum=1;
                        break;
                }
                if(lidx<ridx){
                    lx=xnum;
                    ly=ynum;
                    answer+="L";
                }else if(lidx>ridx){
                    rx=xnum;
                    ry=ynum;
                    answer+="R";
                }else{
                    if(hand.equals("right")){
                        rx=xnum;
                        ry=ynum;
                        answer+="R";
                    }else{
                        lx=xnum;
                        ly=ynum;
                        answer+="L";
                    }
                }
            }
            
            idx++;
        }
        
        return answer;
    }
}
