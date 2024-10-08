class Solution {
    public long solution(int n) {
        if(n == 1)
            return 1;
        
        if(n == 2)
            return 2;
        
        long ansF = 1;
        long ansS = 2;
        long ans = 0;
        
        for(int i = 3; i <= n; i++){
            ans = (ansS + ansF)%1234567;
            ansF = ansS;
            ansS = ans;
        }
        return ans;
    }
    
}