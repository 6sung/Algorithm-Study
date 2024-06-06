class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        StringBuffer str = new StringBuffer();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 1){
                str.append(arr[i].substring(0,1).toUpperCase() + 
                arr[i].substring(1).toLowerCase());
            } else if(arr[i].length() == 1){
                str.append(arr[i].substring(0,1).toUpperCase());
            }

            if(i != arr.length - 1) str.append(" ");
        }

        if(s.endsWith(" ")) str.append(" ");

        return str.toString();
    }
}
