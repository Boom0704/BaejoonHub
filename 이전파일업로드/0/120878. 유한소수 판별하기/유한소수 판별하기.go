func solution(a int, b int) int {
    for i := 1; i <= b; i++ {
        if b%i==0{
            if i == 2|| i==5{
                b /=i
                i=1
            }else {
                if a % i != 0{
                    return 2
                }
            }
        }
    }
    return 1
}