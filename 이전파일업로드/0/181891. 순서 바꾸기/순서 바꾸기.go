func solution(num_list []int, n int) []int {
    arr1 := append(num_list[0:n])
    arr2 := append(num_list[n:len(num_list)])
    arr3 := append(arr2, arr1...)
    return arr3
}