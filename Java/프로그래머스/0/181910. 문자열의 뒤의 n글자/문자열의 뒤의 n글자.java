class Solution {
    public String solution(String my_string, int n) {
        int leng = my_string.length();
	    return my_string.substring(leng-n,leng);
    }
}