func solution(array []int, height int) int {
    answer := 0
    for i := 0; i < len(array); i++ {
        if array[i] > height{
            answer = answer + 1
        }
    }
    return answer
}