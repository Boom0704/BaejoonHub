func solution(picture []string, k int) []string {
    var result []string

    for _, line := range picture {
        expandedLine := make([]rune, 0)

        for _, char := range line {
            for i := 0; i < k; i++ {
                expandedLine = append(expandedLine, char)
            }
        }

        for i := 0; i < k; i++ {
            result = append(result, string(expandedLine))
        }
    }

    return result
}
