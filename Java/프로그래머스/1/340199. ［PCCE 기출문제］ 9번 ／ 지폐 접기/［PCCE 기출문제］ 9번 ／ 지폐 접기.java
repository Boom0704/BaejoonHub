import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        Arrays.sort(wallet);
        // 지갑 wallet  지폐 bill
        int answer = 0;
            System.out.println(wallet[0] + " " + wallet[1]);
        while(compare(wallet, bill)){
            answer++;
            System.out.println(bill[0] + " " + bill[1]);
            if(bill[0]>bill[1])
                bill[0] /=2;
            else
                bill[1] /=2;
        }
        return answer;
    }
    
    boolean compare(int[] wallet, int[] bill) {
        Arrays.sort(bill);
        if(bill[0] > wallet[0]||bill[1] > wallet[1])
            return true;
        else
            return false;
    } 
}