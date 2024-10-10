import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = queue.stream().anyMatch(q -> q[0] > current[0]);

            if (hasHigherPriority) {
                queue.add(current);
            } else {
                count++;
                if (current[1] == location) {
                    return count;
                }
            }
        }
        return count;
    }
}
