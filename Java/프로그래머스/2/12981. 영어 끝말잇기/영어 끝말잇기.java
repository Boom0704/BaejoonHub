import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> usedWords = new HashSet<>();
        char lastChar = words[0].charAt(words[0].length() - 1);
        
        usedWords.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            char firstChar = currentWord.charAt(0);
            
            if (firstChar != lastChar || usedWords.contains(currentWord)) {
                int player = (i % n) + 1;
                int turn = (i / n) + 1;
                answer[0] = player;
                answer[1] = turn;
                break;
            }
            
            usedWords.add(currentWord);
            lastChar = currentWord.charAt(currentWord.length() - 1);
        }
        
        return answer;
    }
}
