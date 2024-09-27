import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int leng = citations.length;
        int answer = 0;
        for (int h = 1; h <= leng; h++) {
            int count = 0;
            for (int i = 0; i < leng; i++) {
                if (citations[i] >= h) {
                    count++;
                }
            }
            if (count >= h) {
                answer = h;
            }
        }
        return answer;
    }
}
