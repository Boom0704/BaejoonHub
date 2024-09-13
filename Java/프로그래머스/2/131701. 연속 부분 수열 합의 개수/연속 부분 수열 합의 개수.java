import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[elements.length * 2];
        
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < elements.length; i++) {
                arr[i + (j * elements.length)] = elements[i];
            }
        }

        for (int length = 1; length <= elements.length; length++) {
            for (int i = 0; i < elements.length; i++) {
                int temp = 0;
                for (int j = 0; j < length; j++) {
                    temp += arr[i + j];
                }
                set.add(temp);
            }
        }

        return set.size();
    }
}
