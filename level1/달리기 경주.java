import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerRanks = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerRanks.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String name = callings[i];
            int rank = playerRanks.get(name);
            String nameF = players[rank-1];
            int rankF = playerRanks.get(nameF);
            playerRanks.put(name,rank-1);
            playerRanks.put(nameF,rank);
            String temp=players[rank-1];
            players[rank-1]=players[rank];
            players[rank]=temp;

        }

        return players;
    }
}
