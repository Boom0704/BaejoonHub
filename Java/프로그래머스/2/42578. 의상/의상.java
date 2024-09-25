import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        List<String> name = new ArrayList<String>();

        for (int i = 0; i < clothes.length; i++) {
            if (!name.contains(clothes[i][1])) {
                name.add(clothes[i][1]);
            }
        }

        for (int i = 0; i < name.size(); i++) {
            int temp = 0;
            for (int j = 0; j < clothes.length; j++) {
                if (clothes[j][1].equals(name.get(i))) {
                    temp++;
                }
            }
            answer *= (temp + 1); 
        }

        return answer - 1;
    }
}
