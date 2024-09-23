def solution(x):
    answer = []
    strn = str(x)
    for i in strn:
        answer.append(int(i))
    return x % sum(answer) == 0