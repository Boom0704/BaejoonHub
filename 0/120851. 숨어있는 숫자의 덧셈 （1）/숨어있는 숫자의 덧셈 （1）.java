class Solution {
      public static boolean isNumber(String strValue) {
    return strValue != null && strValue.matches("[-+]?\\d*\\.?\\d+");
  }

    public int solution(String my_string) {
        String[] arr = my_string.split("");
        int answer = 0;
        for(String s : arr){
            if(isNumber(s))
                answer += Integer.parseInt(s);
        }
        return answer;
    }
}