import "sort"
func solution(array []int) int {
    sort.Ints(array)
    return array[(len(array)-1)/2]
}