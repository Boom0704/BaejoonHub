import "sort"
import "fmt"

func solution(numbers []int) int {
	sort.Ints(numbers)
	fmt.Println("Ints:   ", numbers)
    return numbers[len(numbers)-1]*numbers[len(numbers)-2]
}