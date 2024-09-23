class Solution {
    public int solution(int n) {
        if(n == 0)
            return 0;
        
        int pre = 0;
        int next = 1;
        
        for (int i=0; i<n; i++) {
            int temp = next;
            next = (pre + next)%1234567;
            pre = temp%1234567;
        }
        return pre;
    }
}