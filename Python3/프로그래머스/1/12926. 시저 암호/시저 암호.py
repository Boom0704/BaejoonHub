def solution(s, n):
    result = []
    for char in s:
        if char == " ":
            result.append(" ")
        elif 'A' <= char <= 'Z':  # 대문자일 경우
            result.append(chr((ord(char) - ord('A') + n) % 26 + ord('A')))
        elif 'a' <= char <= 'z':  # 소문자일 경우
            result.append(chr((ord(char) - ord('a') + n) % 26 + ord('a')))
    
    return "".join(result)
