class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skill_tree : skill_trees) {
            int skillIndex = 0;
            boolean isValid = true;
            
            for (char ch : skill_tree.toCharArray()) {
                if (skill.indexOf(ch) != -1) {
                    if (skill.charAt(skillIndex) == ch) {
                        skillIndex++;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                answer++;
            }
        }
        return answer;
    }
}
