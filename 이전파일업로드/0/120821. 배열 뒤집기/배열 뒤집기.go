func solution(num_list []int) []int {
    arr := make([]int, len(num_list))
    for i := 0; i < len(num_list); i++ {
        arr[i] = num_list[len(num_list)-1-i]
    }
    return arr
}