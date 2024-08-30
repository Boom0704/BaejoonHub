class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] ArraysStr = str.split("");
        for(String s : ArraysStr){
            int value = Integer.parseInt(s);
            answer += value;
        }
        return answer;
    }
}