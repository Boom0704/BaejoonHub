import (
    "sort"
    "math"
)

func solution(numlist []int, n int) []int {
    sort.SliceStable(numlist, func(i, j int) bool {
        distI := int(math.Abs(float64(numlist[i] - n)))
        distJ := int(math.Abs(float64(numlist[j] - n)))

        if distI == distJ {
            return numlist[i] > numlist[j]
        }
        
        return distI < distJ
    })

    return numlist
}