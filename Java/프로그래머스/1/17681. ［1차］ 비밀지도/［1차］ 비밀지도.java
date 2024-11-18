import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int j = 0; j < n; j++) {
            // 각 줄의 비밀지도 계산
            StringBuilder temp = new StringBuilder();
            
            // OR 연산으로 두 지도의 정보를 합침
            int merged = arr1[j] | arr2[j];
            
            // n개의 비트를 확인하여 문자열 생성
            for (int i = n - 1; i >= 0; i--) {
                if ((merged & (1 << i)) != 0) { // 비트가 1이면 벽(#)
                    temp.append("#");
                } else { // 비트가 0이면 공백(" ")
                    temp.append(" ");
                }
            }
            
            // 결과 저장
            answer[j] = temp.toString();
        }
        
        return answer;
    }
}
