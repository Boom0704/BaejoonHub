// pccp 연습 공식문서 참고 풀이
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<Integer>();
        int leng = num_list.length;
        int [] result = new int [leng+1];

        for (int i = 0; i< num_list.length; i++){
            result[i] = num_list[i];
        }
        if(num_list[leng-1]>num_list[leng-2]){
            result[leng] = num_list[leng-1] - num_list[leng-2];
        } else{
            result[leng] = num_list[leng-1] * 2;
        }
        

        return result;
    }
}