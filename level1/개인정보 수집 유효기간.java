import java.util.ArrayList;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] parts = today.split("\\.");
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        int[] todays = new int[3];
        for(int i=0;i<3;i++){
            todays[i]=Integer.parseInt(parts[i]);
        }
        String[][] term = new String[terms.length][2];
        for(int i=0;i<terms.length;i++){
            term[i] = terms[i].split(" ");
        }
        for(int i=0;i<privacies.length;i++){
            String[] dates = privacies[i].split(" ");
            String date=dates[0];
            String label = dates[1];
            String[] dateParts = date.split("\\.");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);
            
            for(int j=0;j<terms.length;j++){
                if(label.equals(term[j][0])){
                    month = month+(Integer.parseInt(term[j][1]));
                    if(month>12){
                        while(true){
                            month-=12;
                            year++;
                            if(month<=12) break;
                        }
                    }
                    if(day==1){
                        if(month>1){
                            day=28;
                            month--;
                        }else{
                            day=28;
                            year--;
                            month=12;
                        }
                    }else{
                        day--;
                    }
                     
                    if((year==todays[0]) && (month==todays[1])){
                        if(day<todays[2]){
                            answerList.add(i);
                            continue;
                        }
                    }else if((year==todays[0]) && (month<todays[1])){
                        answerList.add(i);
                        continue;
                    }else if(year<todays[0]){
                        answerList.add(i);
                        continue;
                    }
                    
                    
                }
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i]=answerList.get(i) +1;
        }
        return answer;
    }
}
