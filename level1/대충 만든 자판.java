class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] array= new int[26];
        for(int i=0;i<26;i++){
            array[i]=1000;
            for(int j=0;j<keymap.length;j++){
                for(int z=0;z<keymap[j].length();z++){
                    int rx = (int)keymap[j].charAt(z);
                    if((rx-65)==i){
                        if(array[i]>z){
                            array[i]=z+1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<targets.length;i++){
            int result=0;
            for(int j=0;j<targets[i].length();j++){
                int rx = (int)targets[i].charAt(j);
                if(array[rx-65]==1000){
                    result=-1;
                    break;
                }else{
                    result+=array[rx-65];
                }
            }
            answer[i]=result;
        }
        
        return answer;
    }
}
