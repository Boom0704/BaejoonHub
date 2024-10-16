def solution(s):
    result = []
    
    words = s.split(" ")
    for word in words:
        transformed_word = []
        for idx, char in enumerate(word):
            if idx % 2 == 0:
                transformed_word.append(char.upper())
            else:
                transformed_word.append(char.lower())
        result.append("".join(transformed_word))
    
    return " ".join(result)