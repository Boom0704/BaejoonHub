class Solution {
    public int solution(String my_string, String is_suffix) {
        StringBuffer sb1 = new StringBuffer(my_string);
        String reversedStr = sb1.reverse().toString();
        StringBuffer sb2 = new StringBuffer(is_suffix);
        String reversedSuffix = sb2.reverse().toString();
        int answer = reversedStr.indexOf(reversedSuffix);
        return answer == 0 ? 1 : 0;
    }
}