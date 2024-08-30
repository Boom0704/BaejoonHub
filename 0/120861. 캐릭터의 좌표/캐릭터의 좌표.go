func solution(keyinput []string, board []int) []int {
    location := []int{0, 0}
    maxColIndex := (board[0] - 1) / 2
    maxRowIndex := (board[1] - 1) / 2

    for _, key := range keyinput {
        switch key {
        case "left":
            if location[0] > -maxColIndex {
                location[0]--
            }
        case "right":
            if location[0] < maxColIndex {
                location[0]++
            }
        case "up":
            if location[1] < maxRowIndex {
                location[1]++
            }
        case "down":
            if location[1] > -maxRowIndex {
                location[1]--
            }
        }
    }
    return location
}
