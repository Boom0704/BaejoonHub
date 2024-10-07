import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("[{}]", "").replaceAll("\\s+", "");

        String[] arr = s.split(",");

        Map<String, Integer> countMap = new HashMap<>();
        for (String num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<String> sortedList = new ArrayList<>(countMap.keySet());
        sortedList.sort((a, b) -> countMap.get(b) - countMap.get(a));

        int[] answer = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            answer[i] = Integer.parseInt(sortedList.get(i));
        }

        return answer;
    }
}
