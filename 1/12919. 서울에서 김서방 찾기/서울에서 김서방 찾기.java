class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+ Integer.toString(i)+"에 있다";
            }
            
            System.out.println(seoul[i]);
        }
        
        return answer;
    }
}