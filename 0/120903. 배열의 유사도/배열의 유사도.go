func solution(s1 []string, s2 []string) int {
    s1Map := make(map[string]bool)
    for _, v := range s1 {
        s1Map[v] = true
    }
    
    count := 0
    for _, v := range s2 {
        if s1Map[v] {
            count++
        }
    }
    
    return count
}