func solution(num_list []int) []int {
    result := [2]int{0, 0} // 배열 선언 및 초기화

    for _, num := range num_list { // num_list의 요소를 순회
        if num%2 == 0 {
            result[0]++
        } else {
            result[1]++
        }
    }

    return result[:] // 배열 슬라이스 반환
}