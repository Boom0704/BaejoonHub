func solution(chicken int) int {
    total := 0
    remain := 0
    
    for chicken >= 10 {
        total += chicken / 10
        remain = chicken % 10
        chicken = chicken / 10 + remain
    }
    
    return total
}