func solution(num_list []int, n int) []int {
    num_list = append(num_list[n-1:len(num_list)]);
    return num_list
}