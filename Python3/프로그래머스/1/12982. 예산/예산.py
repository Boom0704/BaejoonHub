def solution(d, budget):
    print(sum(d))
    d.sort()
    if sum(d) <= budget :
        return len(d)
    
    answer = 0
    for i in range (0, len(d)) :
        if answer + d[i] >budget :
            return i
        answer += d[i]
    return answer