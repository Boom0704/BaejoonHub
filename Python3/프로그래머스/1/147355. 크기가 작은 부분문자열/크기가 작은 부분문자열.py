def solution(t, p):
    answer = 0
    for i in range (0, len(t)- len(p)+1):
        temp = t[i:len(p)+i]
        if max(temp, p) == p:
            answer += 1
    return answer