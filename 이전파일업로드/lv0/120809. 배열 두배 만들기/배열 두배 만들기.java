class Solution {
    public int[] solution(int[] numbers) {
        int numbersLeng = numbers.length;
        int[] newArr = new int[numbersLeng];
        for(int i=0; i < numbersLeng ; i ++ ){
            newArr[i] = numbers[i]*2;
        }
        return newArr;
    }
}