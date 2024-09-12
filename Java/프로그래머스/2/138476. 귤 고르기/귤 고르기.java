import java.util.Arrays;
class Solution {
    public int solution(int k, int[] tangerine) {
        int [] count  = new int [tangerine.length];
        int answer = 0;
        Arrays.sort(tangerine);
        int leng = tangerine.length;
        int temp = -1;
        for(int i = 0; i< tangerine.length; i++){
            if(temp != tangerine[i]){
                temp = tangerine[i];
                count[answer++] = 1;
            }else{
             count[answer-1]++;
            }
        }
        Arrays.sort(count);
        answer = 0;
        int sum = 0;
        while(sum < k){
            sum += count[leng-1-answer];
            answer++;
        }
        return answer;
    }
}