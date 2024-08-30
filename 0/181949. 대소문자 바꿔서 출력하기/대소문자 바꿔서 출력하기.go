package main

import (
    "fmt"
    "strings"
)

func main() {
    var s1 string
    fmt.Scan(&s1)

    converted := ""
    for _, char := range s1 {
        if strings.ToUpper(string(char)) == string(char) {
            converted += strings.ToLower(string(char))
        } else {
            converted += strings.ToUpper(string(char))
        }
    }

    fmt.Println(converted)
}
