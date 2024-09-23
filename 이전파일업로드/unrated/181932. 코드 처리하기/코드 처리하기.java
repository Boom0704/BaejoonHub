class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        String[] ArraysStr = code.split("");
        for (int i=0; i<ArraysStr.length; i++) {
            if (ArraysStr[i].equals("1")) {
                mode = !mode;
            }
            else if(mode==true){
                if(i%2==0){
                    answer = answer + ArraysStr[i];
                }
            }
            else if(mode==false){
                if(i%2==1){
                    answer = answer + ArraysStr[i];
                }
            }
        }
        if(answer.equals("")){
            return "EMPTY";
        }
        return answer;
    }
}