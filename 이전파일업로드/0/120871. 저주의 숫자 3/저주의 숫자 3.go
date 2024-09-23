import (
    "strconv"
    "strings"
)
func solution(n int) int {
    for i := 1; i <= n; i++ {
        if i%3 == 0 {
            n++
            continue
        }
        numStr := strconv.Itoa(i)
        if strings.Contains(numStr, "3") {
            n++
            continue
        }
    }
    return n
}