func solution(code string) string {
	ret := ""
	mode := 0

	for idx := 0; idx < len(code); idx++ {
		if mode == 0 {
			if code[idx] != '1' {
				if idx%2 == 0 {
					ret += string(code[idx])
				}
			} else {
				mode = 1
			}
		} else {
			if code[idx] != '1' {
				if idx%2 != 0 {
					ret += string(code[idx])
				}
			} else {
				mode = 0
			}
		}
	}

	if ret == "" {
		return "EMPTY"
	}

	return ret
}