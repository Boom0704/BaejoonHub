import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.substring(i, i + 1))){
                list.add(i-map.get(s.substring(i, i + 1)));
            }else{
                list.add(-1);
            }
            map.put(s.substring(i, i + 1), i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
