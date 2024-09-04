class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        // s.toLowerCase());
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(""))
                continue;
            
            String first = arr[i].substring(0, 1).toUpperCase();
            String second = arr[i].substring(1, arr[i].length()).toLowerCase();
            
            arr[i] = first + second;
        }
        return String.join(" ", arr);
    }
}