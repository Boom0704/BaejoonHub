class Solution {
    public int[] solution(int n, long left, long right) {
        int leng = (int) (right - left + 1);
        int[] answer = new int[leng];
        
        for (long i = left; i <= right; i++) {
            answer[(int) (i - left)] = (int) Math.max(i / n + 1, i % n + 1);
        }

        return answer;
    }
}
