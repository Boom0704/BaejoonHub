class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int halfBrown = (brown-4)/2;
        for(int i = 1; i <= halfBrown-i; i++){
            if(i*(halfBrown-i)==yellow){
                answer[0] = halfBrown + 2 -i;
                answer[1] = i + 2;
            }
        }
        return answer;
    }
}