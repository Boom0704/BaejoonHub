class Solution {
    public int solution(int n) {
        int countOnesInN = Integer.bitCount(n);
        int nextNumber = n + 1;

        while (Integer.bitCount(nextNumber) != countOnesInN) {
            nextNumber++;
        }
        
        return nextNumber;
    }
}
