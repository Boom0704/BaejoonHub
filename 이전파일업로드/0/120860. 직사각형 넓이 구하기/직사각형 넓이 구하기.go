import (
    "sort"
)
func sortByRowSum(matrix [][]int) [][]int {
    less := func(i, j int) bool {
        sumI, sumJ := 0, 0
        for _, num := range matrix[i] {
            sumI += num
        }
        for _, num := range matrix[j] {
            sumJ += num
        }
        return sumI < sumJ
    }

    sort.Slice(matrix, less)

    return matrix
}

func solution(dots [][]int) int {
    sortedMatrix := sortByRowSum(dots)
    return (sortedMatrix[3][0]-sortedMatrix[0][0])*(sortedMatrix[3][1]-sortedMatrix[0][1])
}

