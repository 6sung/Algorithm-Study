class Solution {
    public int floyd(int N, int[][] map, int K){
        for(int m=0;m<N;m++){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(map[i][j]>map[i][m]+map[m][j]){
                        map[i][j]=map[i][m]+map[m][j];
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<N;i++){
            if(map[0][i]<=K){
                count++;
            }
        }
        return count;
    }
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        final int INF = 100000000;
        int map[][] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j){
                    map[i][j]=0;
                }else{
                    map[i][j]=INF;
                }
            }
        }
        
        for (int i = 0; i < road.length; i++) {
            int x = road[i][0] - 1;
            int y = road[i][1] - 1;
            int r = road[i][2];
            map[x][y] = Math.min(map[x][y], r);
            map[y][x] = Math.min(map[y][x], r);
        }
        answer=floyd(N, map,K);

        return answer;
    }
}
