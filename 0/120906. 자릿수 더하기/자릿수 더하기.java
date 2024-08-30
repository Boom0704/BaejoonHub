import java.util.Arrays;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] array_word = str.split("");
        for (int i=0; i<array_word.length; i++) {
            answer += Integer.parseInt(array_word[i]);
        }
        return answer;
    }
}