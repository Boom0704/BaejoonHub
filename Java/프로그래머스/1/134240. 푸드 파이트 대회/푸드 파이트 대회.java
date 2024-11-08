class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 1; i<food.length; i++){
            int temp = food[i];
            int count = temp/2;
            for (int j = 0; j<count; j++){
                answer += Integer.toString(i);
            }
        }
        String reverse = "";
        for (int i = answer.length() - 1; i >= 0; i--) {
            reverse = reverse + answer.charAt(i);        
        }
        return answer+"0"+reverse;
    }
}