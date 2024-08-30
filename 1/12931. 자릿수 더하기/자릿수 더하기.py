def solution(n):
    answer = []
    strn = str(n)
    for i in strn:
        answer.append(int(i))

    return sum(answer)