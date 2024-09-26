class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int plus = 0;
        
        for(int i=0; i< num_list.length; i++){
            mul *= num_list[i];
            plus += num_list[i];
        }
        plus *= plus;
        int answer = 0;
        if(mul < plus)
            answer = 1;
        return answer;
    }
}