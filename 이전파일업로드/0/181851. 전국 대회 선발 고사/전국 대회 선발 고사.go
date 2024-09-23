func solution(rank []int, attendance []bool) int {
    result := -1
    count := 0
    for i := 1; i <= len(rank); i++ {
        for j, value := range rank {
            if i == value{
                if attendance[j]{
                    if count == 0{
                        result = j
                        count++
                    }else {
                        result *= 100
                        result += j
                        count++
                    }
                }
            }
            if count == 3 {
                return result
            }
        }
    }
    return result
}