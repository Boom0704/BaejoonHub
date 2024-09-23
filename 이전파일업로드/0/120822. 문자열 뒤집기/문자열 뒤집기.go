import (
    "strings"
)

func solution(my_string string) string {
    s := strings.Split(my_string, "")
    reverse := make([]string, len(s))

    for i := 0; i < len(s); i++ {
        reverse[i] = s[len(s)-1-i]
    }

    output := strings.Join(reverse, "")
    return output
}
