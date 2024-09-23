def solution(n):
    answer = []
    strn = str(n)
    for i in strn:
        answer.append(i)
    answer.sort(reverse=True)
    return int(''.join(answer))