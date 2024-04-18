class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[] result = new int[friends.length];
        int[] result2 = new int[friends.length];
        int[][] array = new int[friends.length][friends.length];
        for(int i=0;i<friends.length;i++){
            for(int j=0;j<friends.length;j++){
                array[i][j]=0;
            }
        }
        for(int z=0;z<gifts.length;z++){
            
            String[] givetake=gifts[z].split(" ");
            String give=givetake[0];
            String take=givetake[1];
            int x=0; int y=0;
            for(int i=0;i<friends.length;i++){
                if(friends[i].equals(give)) x=i;
                if(friends[i].equals(take)) y=i;
            }
            array[x][y]++;
        }
        for(int i=0;i<friends.length;i++){
            int give=0;
            int take=0;
            for(int j=0;j<friends.length;j++){
                give=give+array[i][j];
                take=take+array[j][i];
            }
            result2[i]=(give-take);
        }
        for(int i=0;i<friends.length;i++){
            int give=0;
            int take=0;
            for(int j=0;j<friends.length;j++){
                if(array[i][j]==array[j][i]){
                    if(result2[i]>result2[j]){
                        result[i]++;
                    }else if(result2[i]<result2[j]){
                        result[j]++;
                    }
                }else{
                    if(array[i][j]>array[j][i]){
                        result[i]++;
                    }else{
                        result[j]++;
                    }
                }
            }
        }
        int max=0;
        for(int i=0;i<friends.length;i++){
            if(max<result[i]) max=result[i];
        }
        answer=max/2;
        return answer;
    }
}
