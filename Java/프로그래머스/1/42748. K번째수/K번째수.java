import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            list.add(temp[commands[i][2] - 1]);
        }

        // List를 배열로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
