import java.util.*;
class Solution {
    public int solution(String s) {
        Map<String, String> replacements = new HashMap<>();
        replacements.put("zero", "0");
        replacements.put("one", "1");
        replacements.put("two", "2");
        replacements.put("three", "3");
        replacements.put("four", "4");
        replacements.put("five", "5");
        replacements.put("six", "6");
        replacements.put("seven", "7");
        replacements.put("eight", "8");
        replacements.put("nine", "9");
        for (Map.Entry<String, String> entry : replacements.entrySet()) {
            s = s.replaceAll(entry.getKey(), entry.getValue());
        }

        return Integer.parseInt(s);
    }
}