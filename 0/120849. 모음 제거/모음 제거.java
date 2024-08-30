class Solution {
    public String solution(String my_string) {
        my_string = my_string.replaceAll("[a,e,u,o,i]", "");
        return my_string;
    }
}