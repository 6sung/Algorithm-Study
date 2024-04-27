import java.util.Arrays;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        int[] array = new int[500];
        int idx=0;
        int k=0;
        for(int i=0;i<data.length;i++){
            if(ext.equals("code") && data[i][0]<val_ext){
                array[idx]=data[i][0]; idx++;
            }else if(ext.equals("date")&& data[i][1]<val_ext){
                array[idx]=data[i][1]; idx++; k=1;
            }else if(ext.equals("maximum") && data[i][2]<val_ext){
                array[idx]=data[i][2]; idx++; k=2;
            }else if(ext.equals("remain")&& data[i][3]<val_ext){
                array[idx]=data[i][3]; idx++; k=3;
            }
        }
        
        int f=0;
        int[] array2 = new int[idx];
        if(sort_by.equals("code")){
            for(int i=0;i<idx;i++){
                for(int j=0;j<data.length;j++){
                    if(array[i]==data[j][k])array2[i]=data[j][0]; 
                }
            }    
        }else if(sort_by.equals("date")){
             for(int i=0;i<idx;i++){
                for(int j=0;j<data.length;j++){
                    if(array[i]==data[j][k]) { array2[i]=data[j][1]; f=1;}
                }
            }   
        }else if(sort_by.equals("maximum")){
             for(int i=0;i<idx;i++){
                for(int j=0;j<data.length;j++){
                    if(array[i]==data[j][k]) {array2[i]=data[j][2]; f=2;}
                }
            }   
        }else{
            for(int i=0;i<idx;i++){
                for(int j=0;j<data.length;j++){
                    if(array[i]==data[j][k]) {array2[i]=data[j][3]; f=3;}
                }
            }
        }
       
         Arrays.sort(array2);
        int[][] answer = new int[idx][4];
        for(int i=0;i<idx;i++){
            for(int j=0;j<data.length;j++){
                if(array2[i]==data[j][f]){
                    answer[i][0]=data[j][0];
                    answer[i][1]=data[j][1];
                    answer[i][2]=data[j][2];
                    answer[i][3]=data[j][3];
                }
            }
        }
         return answer;
    }
}
