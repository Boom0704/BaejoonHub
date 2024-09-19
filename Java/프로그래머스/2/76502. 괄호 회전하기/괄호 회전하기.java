class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            String head = s.substring(i);
            String tail = s.substring(0, i);
            String word = head + tail;
            
            while (true) {
                String temp = word; 
                word = word.replace("()", "");
                word = word.replace("[]", "");
                word = word.replace("{}", "");
                
                if (word.equals(temp)) {
                    break;
                }
            }
            if ( word.equals("")){
                answer++;
            }
        }
        return answer;
    }
}