class Solution {
    public int getGcd(int x, int y){
        if(y==0){
            return x;
        }else{
            return getGcd(y, x%y);
        }
    }
    public int solution(int[] arr) {
        int answer = 0;
        int index=1;
        int lcm=arr[0]*arr[index]/getGcd(arr[0], arr[index]);
        while(true){
            lcm=lcm*arr[index]/getGcd(lcm,arr[index]);
            index++;
            if(index==arr.length) break;
        }
        return lcm;
    }
}
