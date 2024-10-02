import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        int leng = progresses.length;

        while(index < leng) {
            for(int i = 0; i < leng; i++) {
                progresses[i] += speeds[i];
            }

            if(progresses[index] >= 100) {
                int value1 = 0;

                while(index < leng && progresses[index] >= 100) {
                    value1++;
                    index++;
                }
                ans.add(value1);
            }
        }

        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }
}
