import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        HashMap<String, String> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, str.substring(n, n + 1));
        }
        
        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = map.get(o1).compareTo(map.get(o2));
                return result != 0 ? result : o1.compareTo(o2);
            }
        });

        String[] answer = keySet.toArray(new String[0]);
        return answer;
    }
}
