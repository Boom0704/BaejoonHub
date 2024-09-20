import java.util.Arrays;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int[] copyNum = new int[want.length];
        
        for(int i = 0; i<discount.length-9; i++){
            for (int j = 0; j < want.length; j++) {
                copyNum[j] = number[j];
            }
            for(int j = 0; j < 10; j++){
                int num = Arrays.asList(want).indexOf(discount[i+j]);
                if(num == -1)
                    continue;
                else{
                    copyNum[num]--;
                }
            }
            boolean check = Arrays.stream(copyNum).allMatch(value -> value <= 0);
            if(check){
                answer++;
            }
        }
        return answer;
    }
}