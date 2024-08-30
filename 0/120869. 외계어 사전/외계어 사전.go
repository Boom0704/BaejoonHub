import (
	"sort"
	"strings"
)

func solution(spell []string, dictionary []string) int {
	sort.Strings(spell)
	spellStr := strings.Join(spell, "")
	
	for _, word := range dictionary {
		sortedWord := strings.Split(word, "")
		sort.Strings(sortedWord)
		sortedWordStr := strings.Join(sortedWord, "")
		
		if sortedWordStr == spellStr {
			return 1
		}
	}
	
	return 2
}
