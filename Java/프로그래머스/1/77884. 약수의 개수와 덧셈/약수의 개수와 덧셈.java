import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(; left<right+1; left++){
            List<Integer> arr = new ArrayList<Integer>();
            for(int i = 1; i<left+1; i++){
               if(left%i==0){
                   arr.add(i);
               }
            }
            if(arr.size()%2==0){
                answer += left;
            }else{
                answer -= left;
            }
        }
        return answer;
    }
}