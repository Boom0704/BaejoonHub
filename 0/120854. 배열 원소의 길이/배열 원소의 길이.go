func solution(strlist []string) []int {
    arr := make([]int, len(strlist))
    for i := 0; i < len(strlist); i++ {
        arr[i] = len(strlist[i])
    }
    return arr
}