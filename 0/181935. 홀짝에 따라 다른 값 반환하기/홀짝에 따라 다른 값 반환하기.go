func solution(n int) int {
    sum := 0
    if n % 2 == 0 {
        for i:= 2; i <= n; {
            sum += i*i
            i += 2
        }
        return sum
    }
            for i := 1; i <= n; {
            sum += i
            i += 2
        }
        return sum
}