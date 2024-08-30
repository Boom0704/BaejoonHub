func solution(n int, k int) int {
    sum := n*12000;
    cal := k-n/10;
    if cal > 0 {
        sum += cal*2000;
    }
    return sum
}