import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String[] numI = String.valueOf(i).split("");
            int count = 0;
            for (String s : numI) {
                if (s.equals("0") || s.equals("5"))
                    count++;
            }
            if (count == numI.length)
                arrList.add(i);
        }

        if (arrList.size() == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
