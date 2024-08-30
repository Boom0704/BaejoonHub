import (
    "sort"
)
func solution(score [][]int) []int {
    n := len(score)
    averages := make([]float64, n)

    for i := 0; i < n; i++ {
        averages[i] = float64(score[i][0]+score[i][1]) / 2.0
    }

    studentMap := make(map[float64][]int)

    for i, avg := range averages {
        studentMap[avg] = append(studentMap[avg], i+1)
    }

    sort.Sort(sort.Reverse(sort.Float64Slice(averages)))
    ranks := make([]int, n)
    currentRank := 1

    for i := 0; i < n; i++ {
        if i > 0 && averages[i] != averages[i-1] {
            currentRank = i + 1
        }

        for _, student := range studentMap[averages[i]] {
            ranks[student-1] = currentRank
        }
    }

    return ranks
}