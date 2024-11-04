import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        int leng = numbers.length;
        
        for (int i = 0; i < leng; i++) {
            for (int j = i; j < leng; j++) {
                if (i == j)
                    continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        
       return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
