import ( 
    "strings"
) 
func solution(my_string string, n int) string {
    ans := "";
    str := strings.Split(my_string, "");
    for _, value := range str{
        for i := 1; i <= n; i++{
            ans += value
        }
    }
    return ans
}