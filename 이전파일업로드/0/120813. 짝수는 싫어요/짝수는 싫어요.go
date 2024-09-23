func solution(n int) []int {
    arr := make([]int, 0, n)

    for i := 1; i <= n; i++ {
        if i%2 == 1 {
            arr = append(arr, i)
        }
    }

    return arr
}
