import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] reached = new int[N + 1];
        int[] noClear = new int[N + 1];

        for (int stage : stages) {
            if (stage <= N) {
                noClear[stage]++;
            }
            for (int i = 1; i <= Math.min(stage, N); i++) {
                reached[i]++;
            }
        }

        double[] fail = new double[N];
        for (int i = 1; i <= N; i++) {
            if (reached[i] == 0) {
                fail[i - 1] = 0;
            } else {
                fail[i - 1] = (double) noClear[i] / reached[i];
            }
        }
        Integer[] stageIdx = new Integer[N];
        for (int i = 0; i < N; i++) {
            stageIdx[i] = i + 1;
        }

        Arrays.sort(stageIdx, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (Double.compare(fail[a - 1], fail[b - 1]) == 0) {
                    return a - b;
                }
                return Double.compare(fail[b - 1], fail[a - 1]);
            }
        });
        for (int i = 0; i < N; i++) {
            answer[i] = stageIdx[i];
        }

        return answer;
    }
}
