func solution(money int) [2]int {
    a := money / 5500
    b := money % 5500
    answer := [2]int{a, b}
    return answer
}