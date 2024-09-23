def solution(n):
    answer = []
    strn = str(n)
    ren = strn[::-1]
    for i in ren:
        answer.append(int(i))
    return answer