class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            int[] firstMap = getArr(arr1[i], n);
            int[] secondMap = getArr(arr2[i], n);
            String line = "";
            for(int j=0; j<n; j++) {
                if(firstMap[j] == 1 || secondMap[j] == 1) {
                    line += "#";
                } else {
                    line += " ";
                }
            }
            StringBuilder sb = new StringBuilder(line);
            String reverseLine = sb.reverse().toString();
            answer[i] = reverseLine;
        }
        return answer;
    }
    public int[] getArr(int num, int size) {
        int[] result = new int[size];
        for(int i=0; i < size; i++) {
            result[i] = num % 2;
            num = num/2;
        }       
        return result;
    }
}
