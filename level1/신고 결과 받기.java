import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        Map<String, HashSet<String>> reportedIDs = new HashMap<>();
        int[] processMailCount = new int[id_list.length];
        Map<String, Integer> idIndexMap = new HashMap<>();
        for (int i = 0 ; i < id_list.length ; i++) {
            idIndexMap.put(id_list[i], i);
        }
        for (int i = 0 ; i < report.length ; i++) {
            String[] reported = report[i].split(" ");
            if (reportedIDs.get(reported[1]) == null) {
                    reportedIDs.put(reported[1], new HashSet<String>() );
                }
            HashSet<String> set = reportedIDs.get(reported[1]);
            set.add(reported[0]); 
            reportedIDs.put(reported[1], set);
        }
        for (int i = 0 ; i < id_list.length ; i++) { 
            Set<String> reporterIDs = reportedIDs.get(id_list[i]);
            if (reporterIDs != null && reporterIDs.size() >= k) {
                Iterator<String> iter = reporterIDs.iterator();
                while(iter.hasNext()) {
                    String reporter = iter.next();
                    processMailCount[idIndexMap.get(reporter)]++;
                }
            }
        }
        answer = processMailCount;
        return answer;
    }
}
