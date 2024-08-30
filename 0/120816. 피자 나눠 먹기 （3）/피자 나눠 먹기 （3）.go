func solution(slice int, n int) int {
    for i := 1; i <= 100; i++ {
        if i*slice >= n{
            return i
        }
    }
    return 0
}